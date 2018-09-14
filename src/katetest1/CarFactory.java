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
public class CarFactory {
    
    public Car createCar() {
        
        Car newCar = new Car((byte)35, "Ford", "Fiesta", "CA7947XC");
        
        return newCar;
    }
}
