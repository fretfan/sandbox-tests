package spring.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.MovieCatalog;
import spring.beans.MovieConfiguration;
import spring.beans.MovieRecommender;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
//    ApplicationContext context = new ClassPathXmlApplicationContext(
//        "Spring-Module.xml");
//
//    String[] beanDefinitionNames = context.getBeanDefinitionNames();

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MovieConfiguration.class);
    String[] beanDefinitionNames2 = ctx.getBeanDefinitionNames();

    MovieCatalog bean = ctx.getBean("catalogBean", MovieCatalog.class);

//    BeanWithAnnotation bean = context.getBean(BeanWithAnnotation.class);

//    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//    HelloWorld bean = context.getBean(HelloWorld.class);
//    bean.printHello();
//
//    GoodbyeWorld bean1 = context.getBean(GoodbyeWorld.class);
//    bean1.sayGoodbye();
//    context.getBean(AnotherBean.class);
//    context.getBean(ExpensiveToCreateBean.class);



    System.out.println("end");
  }
}
