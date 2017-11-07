package com.maliarenko.a1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntBinaryOperator;

/**
 * Switch case replacement!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //one variant
        HashMap<Integer, String> weekdays = new HashMap<>();

        weekdays.put(0,"Mo");
        weekdays.put(1,"Tu");
        weekdays.put(2,"We");
        weekdays.put(3,"Th");
        weekdays.put(4,"Fr");
        weekdays.put(5,"Sa");
        weekdays.put(6,"Su");

        int dayNumber = 4;
        System.out.println(dayNumber + "th" + " day of week it's: " + weekdays.get(dayNumber));


        //another case with lambda
        Map<String, IntBinaryOperator> operations = new HashMap<>();
        operations.put("subtract", (a, b) -> a - b);
        operations.put("multiply", (a, b) -> a * b);

        System.out.println(operations.get("multiply").applyAsInt(10, 20));

        //another one I used in task_3 (HeroesGame) - in CharacterFactory
    }
}
