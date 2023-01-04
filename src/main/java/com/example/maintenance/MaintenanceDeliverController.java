package com.example.maintenance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MaintenanceDeliverController

{
    String Nachricht;
    @GetMapping("/deliver")
    public String deliver()
    {
        return "Everything operates as expected";
    }

    @GetMapping("/setmsg")
    public String setmsg(String msg)
    {
        Nachricht = msg;
        return "Nachricht wurde gesetzt.\n";
    }
}
