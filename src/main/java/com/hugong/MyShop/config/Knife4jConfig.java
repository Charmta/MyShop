package com.hugong.MyShop.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {
    @Bean
    public GroupedOpenApi commonApi(){
        return GroupedOpenApi.builder()
                .group("测试模块")
                .pathsToMatch("/**")
                .packagesToScan("com.hugong.MyShop.controller")
                .build();
    }
}
