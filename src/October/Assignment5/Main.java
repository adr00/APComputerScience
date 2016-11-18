package October.Assignment5;
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
class Main {

    public static void main(String str[]) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String input = scan.nextLine();

        int inputlength = input.length();
        int percentcounter = 0;
        int i = 0;

        System.out.println("Enter the replacement string: ");
        String replacement = scan.nextLine();
        int replacementlength = replacement.length();
        String[] input1 = new String[inputlength + replacementlength];

        for (i = 0; i < inputlength; i++) {
            if (input.charAt(i) == '%') {
                ++percentcounter;
            }
        }


        if (percentcounter == 0)
            System.out.println("Error: no %");
        else if (percentcounter > 1)
            System.out.println("Error: Incorrect characters");


        else {
            input1[i] = input;
            input1[i] = input1[i].replace("%", replacement);
            System.out.print(input1[i]);
        }
    }
}