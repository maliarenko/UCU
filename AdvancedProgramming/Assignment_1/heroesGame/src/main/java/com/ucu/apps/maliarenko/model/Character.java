package com.ucu.apps.maliarenko.model;

import lombok.*;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Character implements Fighter {

    private int power = 0;
    private int hp = 0;
    private String name;

    public boolean isAlive() {
        boolean b = getHp() > 0;
        if (!b) {
            System.out.println("RIP " + getClass().getSimpleName() + " " + getName() +  "!");
        }
        return b;
    }

    void decreasePower(int d) {
        setPower(Math.max(0, getPower() - d));
    }

    void decreaseHp(int d) {
        setHp(Math.max(0, getHp() - d));
    }

    void toCry() {
        System.out.println(getClass().getSimpleName() + ": Ouch!\n");
    }


    public void kick(Character character) {
        character.toCry();
    }

}
