package com.rmaassurance.emissiondirecte.web;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @GetMapping("/show")
    public String showMessage() {
        return "Hello, this is a sample message!";
    }
    @PostMapping("/achraf")
    public String showMessage2() {
        return "Received message: ";
    }
}
