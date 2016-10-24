/*
 * Lesson 9 Coding Activity Question 1
 *
 * Write the code to print a random integer from 1 to 10 inclusive using Math.random().
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_9_Activity_One {
    public static void main(String[] args) {
      int temp = 0;
      
    while (temp != 20 || temp != -20)
    {
    double x = Math.random()*41; 
    temp = (int)x - 20;
    System.out.println(temp);
    }

    }
}