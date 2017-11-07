package com.maliarenko.a2;

/**
 * IRobot!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InjectRandomIntConfigurator objectConfigurator = new InjectRandomIntConfigurator();
        IRobot iRobot = ObjectFactory.getInstance().addObjectConfigurator(objectConfigurator).createObject(IRobot.class);
        iRobot.cleanRoom();
        System.out.println(iRobot.getVersion());

    }
}
