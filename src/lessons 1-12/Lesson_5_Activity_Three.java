/*
 * Lesson 5 Coding Activity Question 3
 * 
 * Input the radius of a circle and print the circumference and area. 
 * The answer should be a decimal value.
 *
 * Remember the formula for circumference is 2 * pi * r and the formula 
 * for area is pi * r * r. You can use 3.14 for the value of pi in this activity.
 *
 * Sample Run:
 
Enter a radius:
4
Circumference: 25.12
Area: 50.24

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Three {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a Radius:");
       double r = scan.nextDouble();
       double c = 2 * 3.14 * r;
      System.out.println("Circumference: " + c );
      System.out.println("Area: " + r *r * 3.14);
       

    }
}