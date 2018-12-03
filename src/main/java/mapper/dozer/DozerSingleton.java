package mapper.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerSingleton {

  private static Mapper dozer = DozerBeanMapperBuilder.buildDefault();

  public static Mapper getInstance() {
    return dozer;
  }

}
