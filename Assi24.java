/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assi2.pkg4;

import java.util.Scanner;

/**
 *
 * @author sara khater
 */
public class Assi24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1;
        int s2;
        int s3;
        System.out.println("enter three sides");
        s1= input.nextInt();
        s2= input.nextInt();
        s3= input.nextInt();
        if((s1>=(s2+s3))||(s2>=(s1+s3))||(s3>=(s1+s2)))
            System.out.println("Not a valid triangle");
        else if((s1==s2)&&(s1==s3))
            System.out.println(" Equilateral");
        else if((s1==s2)||(s2==s3)||(s1==s3))
             System.out.println("Isosceles ");
        else if((s1!=s2)&&(s2!=s3)&&(s1!=s3))
            System.out.println("Scalene");
            
        // TODO code application logic here
    }
    

