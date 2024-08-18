package com.user.entity;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String userName;
    private int number;

    private List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String userName, int number, List<Contact> contacts) {
        this.userId = userId;
        this.userName = userName;
        this.number = number;
        this.contacts = contacts;
    }

    public User(Long userId, String userName, int number) {
        this.userId = userId;
        this.userName = userName;
        this.number = number;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
