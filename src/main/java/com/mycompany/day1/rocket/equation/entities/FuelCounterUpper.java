/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.day1.rocket.equation.entities;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Venci
 */
public class FuelCounterUpper {
   private ArrayList<Module> modules ;

    public FuelCounterUpper(ArrayList<Module> modules) {
        this.modules = modules;
        this.sum = sum();
    }
    
    private int sum;
    
    public int sum(){
        int sum=0;
        for (Module module : modules) {
            sum+=module.calculateFuel();
        }
        return sum;
    }
   
}
