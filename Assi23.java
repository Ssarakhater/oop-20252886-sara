/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assi2.pkg3;

import java.util.Scanner;

/**
 *
 * @author sara khater
 */
public class Assi23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n1;
        double n2;
        char x;
        double f;
        System.out.println("enter first number");
        n1=input.nextInt();
         System.out.println("Enter operator");
         x=input.next().charAt(0);
         System.out.println("enter second number");
         n2 =input.nextInt();
         switch(x){
             case '+':f=n1+n2;
             System.out.println("result="+f);
         break;
             case '-':f=n1-n2;
             System.out.println("result="+f);
         break;
             case '/':f=n1/n2;
             System.out.println("result="+f);
          break;
             case '*':f=n1*n2;
                 System.out.println("result="+f);
           break;
                 
         }
        // TODO code application logic here
    }
    
}
