package com.ucu.apps.maliarenko.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Hobbit extends Character {

    public static final int defaultPower = 0;
    public static final int defaultHp = 3;

    private int power;
    private int hp;
    private String name;

    public Hobbit(){
        this.setPower(defaultPower);
        this.setHp(defaultHp);
    }

    public void kick(Character character) {
        character.toCry();
    }
}
