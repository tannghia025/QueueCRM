package com.crm.crmqueue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan
@Configuration
@EnableSwagger2
public class Swagger2UIConfig  {
    @Bean
	public Docket produceApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.crm.crmqueue.controller"))
				.paths(PathSelectors.regex("/api.*?"))
				.build().apiInfo(apiInfo());
	}

	public ApiInfo apiInfo() {
		return new ApiInfo("WebAPI - Java Restful API",
				"This is Restful API for Microservice", "V1.0",
				"Hiep Si Mat Na Diend",
				new Contact("Nguyễn Tán Nghĩa", "https://www.thegioididong.com", "nghia02584@gmail.com"),
				"License of API", "API license URL", java.util.Collections.emptyList());
	}


}
