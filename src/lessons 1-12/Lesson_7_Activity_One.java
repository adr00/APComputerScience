/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_One {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a three digit number:");
    int num = scan.nextInt();
    int digit3 = num % 10;
    int digit2 = num/10 % 10;
    int digit1 = num/100 % 10;
    System.out.println("Here are the digits:");
    System.out.println(digit1);
    System.out.println(digit2);
    System.out.println(digit3);
    


    }
}