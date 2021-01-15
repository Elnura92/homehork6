package com.company;

public class Hero {
    private int health;
    private int damage;
    private String power;


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String power) {
        this.health = health;
        this.damage = damage;
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public String getPower(){
        return power;
    }


   }


