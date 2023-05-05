package com.example.demo.entities;

public enum UserRole {

    ADMIN("ADMIN"),
    EMPLOYE("EMPLOYE"),
    CLIENT("CLIENT"),
    USER("USER");

    private String type;

    UserRole(String type) {
        this.type = type;
    }

    public String getName() {
        return type;
    }
}