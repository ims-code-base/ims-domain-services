package com.ims.domain.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.ims.domain")
@EnableMongoRepositories(basePackages = { "com.ims.domain" })
@EnableMongoAuditing
public class IMSDomainServicesApplication {

	public static void main(String args[]) {
		SpringApplication.run(IMSDomainServicesApplication.class, args);
	}
}
