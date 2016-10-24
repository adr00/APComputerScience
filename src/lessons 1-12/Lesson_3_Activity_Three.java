/*
 * Lesson 3 Coding Activity Question 3
 * 
 * Write a program that will ask the user to enter an adjective and a name. 
 * Print the following sentence, replacing the ______ with the words they entered.
 * 
 * My name is _____. I am _____.
 *
 * Sample Run:

Hi there. What is your name?
Ada
What adjective describes you?
logical
My name is Ada. I am logical.

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Three {
    public static void main(String[] args) {
      
    Scanner scan = new Scanner(System.in);
      String n1;
      String n2;
      System.out.println("What is your name?"); 
      n1 = scan.nextLine();
      System.out.println("What adjective describes you?"); 
      n2 = scan.nextLine();
      System.out.println("My name is " + n1 + ". I am " + n2 +".");



    }
}