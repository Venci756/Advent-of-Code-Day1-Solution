/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.day1.rocket.equation.entities;
import java.io.IOException;
/**
 *
 * @author Venci
 */

 
public class ReadTextFile 
{
    public static void main(String[] args) 
    {
        ReadFile rf = new ReadFile();
         
        // The text file location of your choice
        String filename = "C:/Users/Venci/Desktop/MyProjects/AdventOfCode/Day1-rocket-equation/src/main/java/TextFile.txt";
         
        try
        {
            String[] lines = rf.readLines(filename);
         
            for (String line : lines) 
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to create "+filename+": "+e.getMessage());              
        }
    }
}