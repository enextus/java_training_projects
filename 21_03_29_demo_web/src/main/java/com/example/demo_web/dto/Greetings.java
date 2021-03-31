package com.example.demo_web.dto;

//Data transfer object dto
public class Greetings {

    public Greetings() {
    }

    public String name = "werwer";
    public String greetings = "YES!";


    public Greetings(String name, String greetings) {
        this.name = name;
        this.greetings = greetings;
    }

    @Override
    public String toString() {
        return greetings + " " + name;
    }

}
