package com.NeST.libraryAppBackend1.controller;


import com.NeST.libraryAppBackend1.dao.BookDao;
import com.NeST.libraryAppBackend1.dao.IssueDao;
import com.NeST.libraryAppBackend1.dao.RegisterDao;
import com.NeST.libraryAppBackend1.model.Book;
import com.NeST.libraryAppBackend1.model.IssueBook;
import com.NeST.libraryAppBackend1.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class libraryController {

    @Autowired
    private BookDao daob;

    @Autowired
    private RegisterDao daor;

    @Autowired
    private IssueDao daoi;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/")
    public HashMap<String, String> libraryAdmin(){
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> libraryRegister(@RequestBody Register r){
        daor.save(r);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login" , consumes = "application/json", produces = "application/json")
    public List<Register> libraryLogin(@RequestBody Register r){

        return (List<Register>) daor.getUser(r.getUsername(),r.getPassword());

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/entry" , consumes = "application/json", produces = "application/json")
    public HashMap<String, String> libraryEntry(@RequestBody Book b){

        daob.save(b);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/issue" , consumes = "application/json", produces = "application/json")
    public HashMap<String, String> libraryIssue(@RequestBody IssueBook i){


        daoi.save(i);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search" , consumes = "application/json", produces = "application/json")
    public List<Book> librarySearch(@RequestBody Book b){


        return (List<Book>) daob.searchBook(b.getTitle());

    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete" , consumes = "application/json", produces = "application/json")
    public HashMap<String, String> libraryDelete(@RequestBody Book b){
        daob.deleteBook(b.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<Book> viewBook(){
        return (List<Book>) daob.findAll();

    }



}
