package com.example.intenttask2java.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class User implements Serializable {
    int age;
    String name;

    public User( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "User{ name: "+name+", age: "+age+"}";
    }
}
