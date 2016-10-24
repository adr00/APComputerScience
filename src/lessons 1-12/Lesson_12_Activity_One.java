/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args)
     {
Scanner scan = new Scanner(System.in);
System.out.println("Enter an number");
double num1 = scan.nextDouble();
System.out.println("Enter an number");
double num2 = scan.nextDouble();
System.out.println("Enter an number");
double num3 = scan.nextDouble();

double ave = (num1 + num2 + num3) / 3;

if( ave >= 89.5)
  System.out.println("ABOVE AVERAGE");

    }
}