package com.document.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.document.beans"})
@EnableJpaRepositories(basePackages = "com.document.repository")
public class JPAConfig {

}
