package com.maliarenko.a2;

/**
 * IRobot!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
        System.out.println(iRobot.getVersion());

    }
}
