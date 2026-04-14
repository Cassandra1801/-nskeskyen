package com.example.oenskeseddel.controllers;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final JdbcTemplate jdbcTemplate;

    public TestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/db-test")
    public String testDatabase() {
        try {
            Integer userCount = jdbcTemplate.queryForObject(
                    "SELECT COUNT(*) FROM users",
                    Integer.class
            );

            return "DB works! Users in table: " + userCount;
        } catch (Exception e) {
            return "DB error: " + e.getMessage();
        }
    }
}