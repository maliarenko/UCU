package com.ucu.apps.maliarenko;

import com.github.javafaker.Faker;
import com.ucu.apps.maliarenko.factory.CharacterFactory;
import com.ucu.apps.maliarenko.manager.GameManager;
import com.ucu.apps.maliarenko.model.Character;

/**
 * Heroes Game!
 *
 */
public class App 
{
    private static CharacterFactory characterFactory;
    public static void main( String[] args ) {

        Faker faker = new Faker();

        Character c1 = characterFactory.createCharacter();
        c1.setName(faker.name().firstName());

        Character c2 = characterFactory.createCharacter();
        c2.setName(faker.name().firstName());

        System.out.println(c1.toString() + " vs " + c2.toString());

        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);

    }
}
