package com.example.account;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/internal/accounts")
public class AccountController {

    @GetMapping
    public String getAccounts() {
        return "Account Service: Account details retrieved successfully";
    }
}