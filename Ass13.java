/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ass1.pkg3;

import java.util.Scanner;

/**
 *
 * @author sara khater
 */
public class Ass13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1;
        int s2;
        int s3;
        double avg;
        System.out.println("enter 3 scores");
        s1=input.nextInt();
        s2=input.nextInt();
        s3=input.nextInt();
        avg=(s1+s2+s3)/3.0;
        double avg1=Math.round(avg);
        System.out.println(avg1+"  "+avg);
        
        // TODO code application logic here
    }
    
}
