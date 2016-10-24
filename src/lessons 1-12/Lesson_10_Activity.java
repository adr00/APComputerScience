/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_10_Activity {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner (System.in);
      System.out.println("Please enter two decimal values: ");
      double d1 = scan.nextDouble();
      double d2 = scan.nextDouble();
      
      double d3 = ((1000*d1) - (1000 * d2))/1000;
      
      System.out.println("The difference is: "+ d3); 

    }
}