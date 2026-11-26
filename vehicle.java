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
public class vehicle {
    private String brand;
    private String modle;
    private int year;

    public vehicle(String brand, String modle, int year) {
        this.brand = brand;
        this.modle = modle;
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModle() {
        return modle;
    }

    public int getYear() {
        return year;
    }
    public double calculateRentalPrice(int days){
       return days*90; 
    }
    public double calculateRentalPrice(int days,double discount){
     return discount*days*90;
    }
    public void displayDetails(){
        System.out.println("brand:"+brand);
        System.out.println("modle:"+modle);
        System.out.println("year:"+year);
    }

    @Override
    public String toString() {
        return "vehicle{" + "brand=" + brand + ", modle=" + modle + ", year=" + year + '}';
    }
    
     
}
