package com.example.ProjectDodo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {



    @Controller
    public class LoginController {

        @GetMapping("/login")
        public String getLogin() {
            return "login";
        }

    }
}
