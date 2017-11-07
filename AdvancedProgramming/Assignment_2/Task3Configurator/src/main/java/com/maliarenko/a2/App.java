package com.maliarenko.a2;

/**
 * IRobot!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // some variant for manual
        //InjectRandomIntConfigurator objectConfigurator = new InjectRandomIntConfigurator();
        //IRobot iRobot = ObjectFactory.getInstance().addObjectConfigurator(objectConfigurator).createObject(IRobot.class);

        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
        System.out.println("iRobot.Version: " + iRobot.getVersion());

    }
}
