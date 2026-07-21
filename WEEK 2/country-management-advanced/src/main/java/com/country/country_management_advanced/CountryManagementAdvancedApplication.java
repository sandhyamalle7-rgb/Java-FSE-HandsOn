package com.country.country_management_advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.country")
@EntityScan("com.country.entity")
@EnableJpaRepositories("com.country.repository")
public class CountryManagementAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryManagementAdvancedApplication.class, args);
    }

}