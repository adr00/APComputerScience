/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a number:");
       double v1 = scan.nextDouble();
       System.out.println("Please enter a number:");
       double v2 = scan.nextDouble(); 
       System.out.println("Please enter a number:");
       double v3 = scan.nextDouble();
       System.out.println("Please enter a number:");
       double v4 = scan.nextDouble(); 
       System.out.println(v2+v1+v3+v4);
     


    }
}