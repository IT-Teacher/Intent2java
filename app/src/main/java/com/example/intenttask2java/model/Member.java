package com.example.intenttask2java.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Member implements Serializable {
    int age;
    String name;

    public Member( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "Member { name: "+name+", age: "+age+"}";
    }
}
