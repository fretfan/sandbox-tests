package mapper.models;

import java.time.LocalDate;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

  private String name;
  private Integer rating;
  private LocalDate birthDate;
  private AddressDto address;
  private List<String> nicknames;
  private List<RoleDto> roles;
}
