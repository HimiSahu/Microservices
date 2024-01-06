package com.webapp2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {

    @Id
    private long id;
    @Column(name = "first_name", length = 45) // when the column name and variable names are not same
    private String firstname;

    @Column(name = "last_name", length = 45)
    private String lastname;

    @Column(name = "email", unique = true, length = 128)
    private String email;

    @Column(name = "mobile")
    private long mobile;

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
