package com.Riecommerce.ecommercePOC.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping("/test")
    public String test(){
        return "Hi ritik this side ";
    }
}
