/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication98;

/**
 *
 * @author Student
 */
public class Motorcycle extends vehicle{
    private int engineCapacity;

    public Motorcycle(int engineCapacity, String brand, String modle, int year) {
        super(brand, modle, year);
        this.engineCapacity = engineCapacity;
    }
    
    public double calculateRentalPrice(int days){
    return days*60;}
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("engine Capacity:"+engineCapacity);
    }

    @Override
    public String toString() {
        super.toString();
        return "Motorcycle{" + "engineCapacity=" + engineCapacity + '}';
    }
    
    
}
