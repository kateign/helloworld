/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katetest1;

/**
 *
 * @author pato
 */
public class Car {
    private int fuelRemaining = 0;
    private final byte tankCapacity;
    
    /**
     * Creates new cars
     * @param myTankCapacity the tank capacity
     * @param model the model
     * @param brand
     * @param UIN 
     */
    public Car(byte myTankCapacity, String model, String brand, String UIN) {
        tankCapacity = myTankCapacity;
    }
    
    /**
     * @param amount the amount we want to pour in
     * @return The actual amount of fuel used
     */
    public double fillTank(int amount) {
        if (fuelRemaining + amount > tankCapacity) {
            double actualPoured = tankCapacity - fuelRemaining;
            fuelRemaining = tankCapacity;
            return actualPoured;
        } else {
            fuelRemaining = fuelRemaining + amount;
            return amount;
        }
    }
   
}
