package com.company.accountservice.entity;

import java.util.Objects;

public class Account {
    private String id;
    private String username;
    private String email;
    private String passwd;

    public Account() {
    }

    public Account(String id) {
        this.id = id;
    }

    public Account(String id, String username, String email, String passwd) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwd = passwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
