package com.ucu.apps.maliarenko.manager;

import com.ucu.apps.maliarenko.model.Character;

import java.util.Random;

public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            Random random = new Random();
            if (random.nextBoolean()) {
                c1.kick(c2);
            } else {
                c2.kick(c1);
            }
        }
    }
}
