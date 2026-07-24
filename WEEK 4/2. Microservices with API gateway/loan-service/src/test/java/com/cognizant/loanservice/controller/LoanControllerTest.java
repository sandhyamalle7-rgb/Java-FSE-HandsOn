package com.cognizant.loanservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class LoanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllLoansOutput() throws Exception {
        MvcResult result = mockMvc.perform(get("/loans"))
                .andExpect(status().isOk())
                .andReturn();

        System.out.println("\n==========================================");
        System.out.println("HTTP GET /loans OUTPUT:");
        System.out.println(result.getResponse().getContentAsString());
        System.out.println("==========================================\n");
    }

    @Test
    public void testGetLoanByNumberOutput() throws Exception {
        MvcResult result = mockMvc.perform(get("/loans/LN5001"))
                .andExpect(status().isOk())
                .andReturn();

        System.out.println("\n==========================================");
        System.out.println("HTTP GET /loans/LN5001 OUTPUT:");
        System.out.println(result.getResponse().getContentAsString());
        System.out.println("==========================================\n");
    }
}
