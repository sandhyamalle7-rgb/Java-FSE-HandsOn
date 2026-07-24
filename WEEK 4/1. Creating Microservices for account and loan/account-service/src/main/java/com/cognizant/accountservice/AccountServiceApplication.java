package com.cognizant.accountservice;

import com.cognizant.accountservice.model.Account;
import com.cognizant.accountservice.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(AccountRepository repository) {
        return args -> {
            repository.save(new Account("ACC1001", "John Doe", "Savings", 5000.00));
            repository.save(new Account("ACC1002", "Jane Smith", "Current", 12500.50));
        };
    }
}
