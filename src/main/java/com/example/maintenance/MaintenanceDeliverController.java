package com.example.maintenance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MaintenanceDeliverController

{
    @GetMapping("/deliver")
    public String deliver()
    {
        return "Everything operates as expected";
    }
}
