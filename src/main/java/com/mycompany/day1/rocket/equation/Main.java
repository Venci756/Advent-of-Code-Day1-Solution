/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.day1.rocket.equation;
import com.mycompany.day1.rocket.equation.entities.Module;
import com.mycompany.day1.rocket.equation.entities.*;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author Venci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("The total fuel required for all modules is " + fcu.sum());
        
        ReadFile rf = new ReadFile();
         
        // The text file location of your choice
        String filename = "C:\\Users\\Venci\\Desktop\\MyProjects\\AdventOfCode\\Day1-rocket-equation\\src\\main\\java\\TextFile\\PuzzleInput.txt";
         
        ArrayList<Integer> massPerModule = new ArrayList<Integer>();
        ArrayList<Integer> fuelOfFuelPerModule = new ArrayList<Integer>();
        int totalMass = 0;
        int totalMassPerFuelModule=0;
        
        try
        {
            String[] lines = rf.readLines(filename);
         
            for (String line : lines) 
            {
                Module module = new Module(Integer.parseInt(line));
                System.out.println("Mass per module " +line +  " fuel required for that same module " + module.calculateFuel()+".");
                massPerModule.add(module.calculateFuel());
                fuelOfFuelPerModule.add(module.calculateFuelRecursivly(module.getMass(),fuelOfFuelPerModule));
            }
            for (Integer mass : massPerModule) {
                totalMass+=mass;
            }
            
            System.out.println("The total mass is :" + totalMass + ", which is the answer for the first part, "
                    + "which is the answer for the first part of the puzzle.");
            
            for (Integer unit : fuelOfFuelPerModule) {
               // System.out.println("Unit ---------" + unit);
                totalMassPerFuelModule= totalMassPerFuelModule+unit;
            }
            System.out.println("The total mass per fuel of fuel is " + totalMassPerFuelModule + ", which is the answer for"
                    + "the second part of the puzzle.");
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to create "+filename+": "+e.getMessage());              
        }
        
//        Module recMod = new Module(1989);
//        recMod.calculateFuelRecursivly(recMod.getMass());
//        
//        int sumFuelOfFuels = 0;
//        for (Integer fuelOfFuel : recMod.getFuelOfFuels()) {
//            System.out.println(fuelOfFuel);
//            sumFuelOfFuels += fuelOfFuel;
//        }
//        System.out.println(sumFuelOfFuels);
//        int sumOfAllFuels = 0;
//        for (Integer unit : recMod.getFuelOfFuels()) {
//            sumOfAllFuels+=unit;
//        }
//        System.out.println(sumOfAllFuels);
    }
    public int sumTheWholeModules(ArrayList<Integer> modules,Module module){
        int sumFuelOfFuels = 0;
        for (Integer fuelOfFuel : module.getFuelOfFuels()) {
            System.out.println(fuelOfFuel);
            sumFuelOfFuels += fuelOfFuel;
        }
        System.out.println(sumFuelOfFuels);
        
        
        return sumFuelOfFuels;
    }
    
}
