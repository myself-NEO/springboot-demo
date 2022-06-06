package com.springboot.demo.controller.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI(@Value("Application Description") String appDescription,
                                 @Value("V1") String appVersion) {
        return new OpenAPI().info(new Info().title("Demo Spring Project")
                .version(appVersion)
                .description(appDescription)
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
