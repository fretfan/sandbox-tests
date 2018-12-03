package mapper.models;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

//MUST USER GETTER/SETTER, else Dozer fails to set values
@Getter
@Setter
public class User {

  private String name;
  private Integer rating;
  private LocalDate birthDate;
  private Address address;
  private List<String> nicknames;
  private List<Role> roles;

}
