package com.company;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero[] arrayHeroes = {magic,medic,warrior};

        for (int i = 0; i < arrayHeroes.length; i++) {
            arrayHeroes[i].applySuperAbility("");
        }


    }
}
