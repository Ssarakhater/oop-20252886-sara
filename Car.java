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
public class Car extends vehicle{
    private int numberOfDoors;

    public Car(int numberOfDoors, String brand, String modle, int year) {
        super(brand, modle, year);
        this.numberOfDoors = numberOfDoors;
    }
    public double calculateRentalPrice(int days){
    return days*80;}
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("number of doors: "+numberOfDoors);
        
    }

    @Override
    public String toString() {
        super.toString();
        return "Car{" + "numberOfDoors=" + numberOfDoors + '}';
    }
    
    
}
