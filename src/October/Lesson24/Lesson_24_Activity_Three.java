package October.Lesson24;
import java.util.Scanner;
public class Lesson_24_Activity_Three {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100:");
        int num = scan.nextInt();
        int print = 0;
        if( num >=0 && num <= 100)
        {
            for (int i = num; i <= 100; i++)
            {
                System.out.print(i + (print % 20 == 0 ? "\n" : " "));
            }
        }
        else
        {
            System.out.println("error");
        }

    }
}
