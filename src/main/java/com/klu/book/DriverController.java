package com.klu.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/drivers")
    public String drivers() {
        return "Driver Service running on port " + port;
    }
}