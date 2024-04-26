package org.microservices.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World from AccountsController for MicroServices";
    }
    @GetMapping("/test")
    public String test() {
        return "Test";
    }

}
