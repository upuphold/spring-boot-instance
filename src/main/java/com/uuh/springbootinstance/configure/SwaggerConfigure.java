package com.uuh.springbootinstance.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author cg
 * @description swagger配置类
 * @date 2019/12/20 15:14
 * @since 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigure {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder().title("Control Service").description("API文档").version("2.0.0").build())
                .select().apis(RequestHandlerSelectors.basePackage("com.uuh.springbootinstance"))
                .paths(PathSelectors.any()).build();
    }

}