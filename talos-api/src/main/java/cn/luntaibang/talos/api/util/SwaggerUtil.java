 package cn.luntaibang.talos.api.util;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

 /**
  * <p>Swagger文档工具类</p>
  */
public class SwaggerUtil {

    private static ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("轮胎邦系统API文档")
                .contact(new Contact("Arrows","https://github.com/shangminlee/talos","shangmlee@foxmail.com"))
                .build();
    }

    public static Docket initDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
