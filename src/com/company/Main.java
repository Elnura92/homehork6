package com.company;

import java.util.Random;

public class Main {

    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefenceType = "";
    public static int[] heroesHealth = {260, 270, 300};
    public static int[] heroesDamage = {10, 20, 5};
    public static String[] heroesAttackType = {"Physical", "Magical", "Mental"};




    public static void main(String[] args) {

        while (!isFinished()){
            round();
        }

        //homework#4
        Hero hero1 = new Hero(350, 60, "Может летать");
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        System.out.println(hero1.getHealth());
        System.out.println(hero1.getDamage());
        System.out.println(hero1.getPower());





    }

    public static void round() {
        printStatistics();
        System.out.println("Round was started!");
        heroesHit();
        changeBossDefence();
        bossHit();
        printStatistics();
    }

    public static void printStatistics(){
        System.out.println("--------------");
        System.out.println("Boss health: " + bossHealth);
        System.out.println("Warrior health: " + heroesHealth[0]);
        System.out.println("Magic health: " + heroesHealth[1]);
        System.out.println("Kinetic health: " + heroesHealth[2]);
        System.out.println("--------------");
    }

    public static void heroesHit(){
        for (int i = 0; i < heroesHealth.length; i++) {
            if (bossHealth > 0 && heroesHealth[i] > 0) {
                if (bossHealth - heroesDamage[i] < 0) bossHealth = 0;
                else bossHealth = bossHealth - heroesDamage[i];
            }
        }

    }

    public static void bossHit() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                if (heroesHealth [ i] - bossDamage < 0) heroesHealth[i] = 0;
                else heroesHealth[i] = heroesHealth[i]  - bossDamage;
            }
        }
    }

    public static boolean isFinished() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!!!!");
            return true;
        }

        if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!!");
            return true;
        }

        return false;
    }







    public static void changeBossDefence(){
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
        System.out.println("Boss defence type: " + bossDefenceType);


    }













}
