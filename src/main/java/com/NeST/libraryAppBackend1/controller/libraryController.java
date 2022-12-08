package com.NeST.libraryAppBackend1.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {

    @PostMapping(path = "/")
    public String libraryAdmin(){
        return "this is the admin page";

    }
    @PostMapping(path = "/register")
    public String libraryRegister(){
        return "This is the user registration page";

    }
    @PostMapping(path = "/login")
    public String libraryLogin(){
        return "This is the user login page";

    }
    @PostMapping(path = "/entry")
    public String libraryEntry(){
        return "This is the book entry page";

    }
    @PostMapping(path = "/issue")
    public String libraryIssue(){
        return "This is the book issue page";

    }
    @PostMapping(path = "/search")
    public String librarySearch(){
        return "This is the book search page";

    }
    @PostMapping(path = "/edit")
    public String libraryEdit(){
        return "This is the book edit page";

    }
    @PostMapping(path = "/delete")
    public String libraryDelete(){
        return "This is the book delete page";

    }


}
