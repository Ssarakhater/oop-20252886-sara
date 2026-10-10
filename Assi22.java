/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assi2.pkg2;

import java.util.Scanner;

/**
 *
 * @author sara khater
 */
public class Assi22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int y;
        System.out.println("enter year");
        y=input.nextInt();
        if(((y%4==0)&&(y%100!=0))||(y%400==0))
            System.out.println("Leap year");
        else System.out.println("Not a leap year");
        // TODO code application logic here
    }
    
}
