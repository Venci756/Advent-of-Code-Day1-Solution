/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.day1.rocket.equation.entities;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.day1.rocket.equation.entities.*;
import java.util.Scanner;

/**
 *
 * @author Venci
 */


//Unnecessary service class for the solution of the puzzle

public class Service {
    public ArrayList<Module> addModules(){
        ArrayList<Module> modules = new ArrayList<Module>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many modules you need for the travel.");
        int numberOfModules = scanner.nextInt();
        scanner.nextLine();
        
        
        while(numberOfModules>0){
            System.out.println("Enter number of mas for the module with number " + numberOfModules);
            Module module = new Module(scanner.nextInt());
            modules.add(module);
            numberOfModules--;
        }
        for (Module module : modules) {
            System.out.println(module.calculateFuel());
        }
        scanner.close();
        return modules;
    }
}
