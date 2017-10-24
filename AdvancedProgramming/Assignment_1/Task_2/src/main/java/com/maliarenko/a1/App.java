package com.maliarenko.a1;

import javax.swing.*;
import java.io.*;
import java.util.Random;

/**
 * Guess the number!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //read high score
        File file = new File("highScore.txt");
        float highScore = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null)            {
                try {
                    float score = Float.parseFloat(line.trim());
                    if (score > highScore)
                    {
                        highScore = score;
                    }
                } catch (NumberFormatException e1) {
                    //System.err.println("something wrong: " + line);
                }
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException ex) {
            System.err.println("Error reading from file");
        }


        //enter initial parameters
        String str_max = JOptionPane.showInputDialog("Enter max");
        int max = Integer.parseInt(str_max);

        Random rand = new Random();
        int secretNumber = rand.nextInt(max);

        int attempt = 0;
        boolean success = false;

        //let's go
        while (!success) {

            String str_number = JOptionPane.showInputDialog("guess the number up to " + max);
            int number = Integer.parseInt(str_number);
            attempt++;

            if (number == secretNumber) {
                success = true;
            } else if (number > secretNumber) {
                JOptionPane.showMessageDialog(null,"too high. let's try again");
            } else {
                JOptionPane.showMessageDialog(null,"too low. let's try again");
            }

        }

        //crunch the data )
        double score = max/attempt;
        JOptionPane.showMessageDialog(null,"Win!");
        JOptionPane.showMessageDialog(null,"Your Score: " + score);

        //compare
        if (score > highScore)
        {
            System.out.println("You now have the new high score! The previous high score was " + highScore);
            JOptionPane.showMessageDialog(null," and You have the new high score!");

            //write high score
            try {
                BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
                output.newLine();
                output.append("" + score);
                output.close();

            } catch (IOException ex1) {
                System.out.printf("Error writing to file: %s\n", ex1);
            }

        }
    }
}
