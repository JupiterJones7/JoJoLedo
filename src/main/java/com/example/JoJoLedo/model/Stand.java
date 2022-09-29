package com.example.JoJoLedo.model;

public class Stand {
    String standName;
    String ability;
    int strength;
    int speed;
    int range;
    int presicion;

    public Stand(String standName, String ability, int strength, int speed, int range, int presicion) {
        this.standName = standName;
        this.ability = ability;
        this.strength = strength;
        this.speed = speed;
        this.range = range;
        this.presicion = presicion;
    }

    public String getStandName() {
        return standName;
    }

    public void setStandName(String standName) {
        this.standName = standName;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }
}
