package com.ucu.apps.maliarenko.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Elf extends Character {

    public static final int defaultPower = 10;
    public static final int defaultHp = 10;

    private int power;
    private int hp;

    public Elf(){
        this.setPower(defaultPower);
        this.setHp(defaultHp);
    }

    public void kick(Character character) {

        if (character.getPower() < getPower()) {
            character.setHp(0);
        } else {
            character.decreasePower(1);
        }

        System.out.println(getClass().getSimpleName() + " kick " + character.getClass().getSimpleName() + ". Effect: " + character.toString());

    }

}
