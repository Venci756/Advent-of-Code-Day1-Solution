/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.day1.rocket.equation.entities;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Venci
 */
public class Module {

    private int mass;
    private ArrayList<Integer> fuelOfFuels;

    public ArrayList<Integer> getFuelOfFuels() {
        return fuelOfFuels;
    }

    public void setFuelOfFuels(ArrayList<Integer> fuelOfFuels) {
        this.fuelOfFuels = fuelOfFuels;
    }

    public Module() {
    }
    ArrayList<Integer> temp = new ArrayList<Integer>();

    public Module(int mass) {
        this.mass = mass;
        setFuelOfFuels(temp);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int calculateFuel() {
        return mass / 3 - 2;
    }
    
    public int calculateFuelRecursivly(int mass, ArrayList<Integer> list) {
        
        
        mass = mass / 3 - 2;
        //System.out.println(mass);
        
        if (mass <= 0) {
            return 0;
        }
        if (mass > 0) {
            list.add(mass);
        }
        
        return calculateFuelRecursivly(mass,list);
    }

}
