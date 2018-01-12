package com.example.salman.customcontactadapter;

/**
 * Created by Salman on 10/4/2017.
 */

public class User {
    int id;
    String name;
    String phone;

    public String toString() {
        return "{"+ name + ", " + phone + '\'' + '}';
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}