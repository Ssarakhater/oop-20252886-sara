/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assi2.pkg1;

import java.util.Scanner;

/**
 *
 * @author sara khater
 */
public class Assi21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sc;
        System.out.print("enter score");
        sc=input.nextInt();
        if(sc>=90)
         System.out.print("A"+" ");
        else if(sc>=80)
            System.out.print("B"+" ");
        else if(sc>=70)
            System.out.print("C"+" ");
        else if(sc>=60)
            System.out.print("D"+" ");
        else System.out.print("F"+" ");
        
        // TODO code application logic here
    }
    
}
