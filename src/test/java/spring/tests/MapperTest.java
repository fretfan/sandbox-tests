package spring.tests;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.github.dozermapper.core.Mapper;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mapper.dozer.DozerSingleton;
import mapper.models.Address;
import mapper.models.Role;
import mapper.models.RoleDto;
import mapper.models.User;
import mapper.models.UserDto;
import org.junit.Test;

public class MapperTest {

  private static String NAME = "Bob";
  private static Integer RATING = 5;
  private static LocalDate BIRTHDATE = LocalDate.of(2000, 1, 1);
  private static List<String> NICKNAMES = Stream.of("Rob", "Bobert", "Bobio").collect(Collectors.toList());
  private static String STREET = "Vabaduse Str";
  private static Integer HOUSE_NR = 1;
  private static String ADMIN = "ADMIN";
  private static String MODERATOR = "MODERATOR";
  private static List<Role> ROLES = Stream.of(new Role(ADMIN), new Role(MODERATOR)).collect(Collectors.toList());


  @Test
  public void testDozer() {

    Mapper mapper = DozerSingleton.getInstance();

    User user = generateUser();
    UserDto dto = mapper.map(user, UserDto.class);

    assertThat(dto.getName(), is(NAME));
    assertThat(dto.getRating(), is(RATING));
    assertThat(dto.getBirthDate(), is(BIRTHDATE));
    assertThat(dto.getNicknames(), is(NICKNAMES));
    assertThat(dto.getAddress().getStreet(), is(STREET));
    assertThat(dto.getAddress().getHouseNr(), is(HOUSE_NR));

    List<String> roles = dto.getRoles().stream().map(RoleDto::getName).collect(Collectors.toList());

    assertThat(roles, hasItems(ADMIN, MODERATOR));

  }

  private User generateUser() {
    User user = new User();
    user.setName(NAME);
    user.setRating(RATING);
    user.setBirthDate(BIRTHDATE);
    user.setNicknames(NICKNAMES);

    Address address = new Address();
    address.setStreetName(STREET);
    address.setHouseNr(HOUSE_NR);
    user.setAddress(address);

    user.setRoles(ROLES);

    return user;
  }
}
