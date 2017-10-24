package com.ucu.apps.maliarenko;

import com.ucu.apps.maliarenko.factory.CharacterFactory;
import com.ucu.apps.maliarenko.manager.GameManager;
import com.ucu.apps.maliarenko.model.Character;
import com.ucu.apps.maliarenko.model.Fighter;

/**
 * Heroes Game!
 *
 */
public class App 
{
    private static CharacterFactory characterFactory;
    public static void main( String[] args ) {

        Character c1 = characterFactory.createCharacter();
        System.out.println(c1.toString());

        Character c2 = characterFactory.createCharacter();
        System.out.println(c2.toString());

        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);

    }
}
