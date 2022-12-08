package com.NeST.libraryAppBackend1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IsuueBook")
public class IssueBook {


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String doi;
    private String title;
    private String memId;

    public IssueBook() {
    }

    public IssueBook(int id, String name, String doi, String title, String memId) {
        this.id = id;
        this.name = name;
        this.doi = doi;
        this.title = title;
        this.memId = memId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }
}
