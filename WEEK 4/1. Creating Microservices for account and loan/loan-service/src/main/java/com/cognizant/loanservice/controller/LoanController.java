package com.cognizant.loanservice.controller;

import com.cognizant.loanservice.model.Loan;
import com.cognizant.loanservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @GetMapping("/{loanNumber}")
    public ResponseEntity<Loan> getLoanByNumber(@PathVariable String loanNumber) {
        return loanRepository.findByLoanNumber(loanNumber)
                .map(loan -> new ResponseEntity<>(loan, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan) {
        Loan savedLoan = loanRepository.save(loan);
        return new ResponseEntity<>(savedLoan, HttpStatus.CREATED);
    }
}
