package com.novauc;

/**
 * Created by kevinallen on 3/2/17.
 */

public class User {
    int id;
    String name;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name) {

        this.name = name;
    }

    public User(int id, String name, String Password) {
        this.name = name;
        this.id = id;
        this.name = password;

    }
}