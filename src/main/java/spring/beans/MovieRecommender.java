package spring.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {


  @Autowired
  public ApplicationContext applicationContext;
  @Autowired
  public BeanFactory beanFactory;
  @Autowired
  public MovieCatalog movieCatalog;


}
