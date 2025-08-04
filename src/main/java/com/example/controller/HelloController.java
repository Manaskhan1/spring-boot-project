package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DataBaseConnectorService;

@RestController
public class HelloController {

    @Autowired
    private DataBaseConnectorService dataBaseConnectorService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping("/db-connection")
    public String dbConnection() {
        try {
            if (dataBaseConnectorService.getConnection() != null) {
                return "Database connection successful!";
            } else {
                return "Failed to connect to the database.";
            }
        } catch (Exception e) {
            return "Error connecting to the database: " + e.getMessage();
        }
    }
}
