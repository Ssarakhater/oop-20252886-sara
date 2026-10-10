/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ass1.pkg4;

import java.util.Scanner;

/**
 *
 * @author sara khater
 */
public class Ass14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int d;
        int w;
        int d2;
        System.out.print("enter number of days");
        d=input.nextInt();
        w=d/7;
        d2=d%7;
        System.out.println(w+"weeks "+"and"+d2+"days");
        // TODO code application logic here
    }
    
}
