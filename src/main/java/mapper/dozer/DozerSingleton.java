package mapper.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import mapper.models.Address;
import mapper.models.AddressDto;

public class DozerSingleton {

  private static Mapper dozer;

  public static Mapper getInstance() {
    if (dozer != null) {
      return dozer;
    }
    // need to provide custom builder per module?
    BeanMappingBuilder builder = new BeanMappingBuilder() {
      @Override
      protected void configure() {
        mapping(Address.class, AddressDto.class)
            .fields("streetName", "street"); // if field missing MappingException thrown
      }
    };

    dozer = DozerBeanMapperBuilder.create()
        .withMappingBuilder(builder)
        .build();

    return dozer;
  }

}
