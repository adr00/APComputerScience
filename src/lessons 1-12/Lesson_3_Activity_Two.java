/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String n1;
      String n2;
      String n3;
      System.out.println("Enter a name."); 
      n1 = scan.nextLine();
      System.out.println("Enter a name."); 
      n2 = scan.nextLine();
      System.out.println("Enter a name."); 
      n3 = scan.nextLine();
      System.out.println(" " + n3 + "  " + n2 + "  " + n1 );



    }
}