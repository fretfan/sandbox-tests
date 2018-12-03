package mapper.dozer;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaSingleton {

  private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

  public static MapperFactory getInstance() {
    return mapperFactory;
  }

}
