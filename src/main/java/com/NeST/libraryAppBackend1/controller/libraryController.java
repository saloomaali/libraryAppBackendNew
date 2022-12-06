package com.NeST.libraryAppBackend1.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {

    @PostMapping("/")
    public String libraryWelcome(){
        return "welcome to libray website, this is the admin page";

    }
    @PostMapping("/register")
    public String libraryRegister(){
        return "This is the user registration page";

    }
    @PostMapping("/login")
    public String libraryLogin(){
        return "This is the user login page";

    }
    @PostMapping("/entry")
    public String libraryEntry(){
        return "This is the book entry page";

    }
    @PostMapping("/issue")
    public String libraryIssue(){
        return "This is the book issue page";

    }


}
