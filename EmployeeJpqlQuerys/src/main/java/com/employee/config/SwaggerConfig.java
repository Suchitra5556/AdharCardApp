package com.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

//http://localhost:8082/swagger-ui.html#
public class SwaggerConfig {      
	 @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo())
	    		  .select()
	         .apis(RequestHandlerSelectors.basePackage("com.employee.controller")).build();
	   }
	 private ApiInfo getApiInfo() {
		 
	        return new ApiInfoBuilder()
	                .title("Employee API Developed By Suchitra ")
	                .description("Employee  REST API")
	                .version("1.0.0-SNAPSHOT")
	                .contact("Suchitra contact No. 2225436655")
	                .license("All rights reserved to Suchitra")
	                .licenseUrl("https://www.Suchitra.com/in/en")
	                .build();
	    }
}
