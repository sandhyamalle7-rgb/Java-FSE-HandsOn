package com.cognizant.loanservice;

import com.cognizant.loanservice.model.Loan;
import com.cognizant.loanservice.repository.LoanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(LoanRepository repository) {
        return args -> {
            repository.save(new Loan("LN5001", "John Doe", "Home Loan", 250000.00, 50000.00, 200000.00));
            repository.save(new Loan("LN5002", "Jane Smith", "Car Loan", 35000.00, 10000.00, 25000.00));
        };
    }
}
