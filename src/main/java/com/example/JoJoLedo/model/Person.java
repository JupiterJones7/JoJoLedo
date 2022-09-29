package com.example.JoJoLedo.model;

public class Person {

    String firstName;
    String lastName;
    int alter;
    String feature;

    public Person(String firstName, String lastName, int alter, String feature) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alter = alter;
        this.feature = feature;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
