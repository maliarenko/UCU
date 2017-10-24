package com.ucu.apps.maliarenko.model;

import com.ucu.apps.maliarenko.utils.Utils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
public class Knight extends Character {

    public static final int minPower = 5;
    public static final int maxPower = 15;
    public static final int minHp = 5;
    public static final int maxHp = 15;

    private int power;
    private int hp;


    public Knight(){
        this.setPower(Utils.getRandomInt(minPower, maxPower));
        this.setHp(Utils.getRandomInt(minHp, maxHp));
    }

    public void kick(Character character) {

        character.decreaseHp(Utils.getRandomInt(0, getPower()));

        System.out.println(getClass().getSimpleName() + " kick " + character.getClass().getSimpleName() + ". Effect: " + character.toString());

    }
}
