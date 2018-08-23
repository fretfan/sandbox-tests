package spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "spring.beans")
public class MovieConfiguration {

  @Bean
  @Primary
  public MovieCatalog firstMovieCatalog() {
    return new MovieCatalog("firstMovieCatalog");
  }

  @Bean
  public MovieCatalog secondMovieCatalog() {
    return new MovieCatalog("secondMovieCatalog");
  }

}
