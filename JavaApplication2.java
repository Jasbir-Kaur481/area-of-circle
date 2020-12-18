/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author JASBIR
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     double r,a;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle:");
        
        r = input.nextDouble();
        
         a= Math.PI*r*r;
         
         System.out.printf("Area of circle is: a = %.2f\n" , a);
            
        
    }
    
}
