package spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MovieCatalog {

  private String val = "unset";

  public MovieCatalog(String val) {
    this.val = val;
  }
  public MovieCatalog() {

  }

  @Bean
  public MovieCatalog catalogBean() {
    return new MovieCatalog("catalogBean");
  }

}
