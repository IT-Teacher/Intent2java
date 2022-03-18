package com.example.intenttask2java.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class User implements Serializable {
    String age;
    String name;

    public User( String name,String age) {
        this.age = age;
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "User{ name: "+name+", age: "+age+"}";
    }
}
