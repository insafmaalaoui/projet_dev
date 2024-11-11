package com.devproject.dev.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/signin")
    public String signin() {
        return "signin"; // Renvoie le fichier signin.html
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup"; // Renvoie le fichier signup.html
    }
        @GetMapping("/index")
    public String index() {
        return "index"; // Renvoie le fichier signup.html
    }
    @GetMapping("/reservation")
    public String reservation() {
        return "reservation"; // Renvoie le fichier signup.html
    }
    @GetMapping("/AboutUs")
    public String aboutus() {
        return "AboutUs"; // Renvoie le fichier signup.html
    }
    @GetMapping("/services")
    public String services() {
        return "services"; // Renvoie le fichier signup.html
    }
}
