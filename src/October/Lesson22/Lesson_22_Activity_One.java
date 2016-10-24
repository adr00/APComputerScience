package October.Lesson22;

import java.util.Scanner;

/**
 * Created by andrewrusso on 10/24/16.
 */
public class Lesson_22_Activity_One {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String text = scan.nextLine();
        for(int i = 0; i < text.length(); i++)
        {
            System.out.println(text.charAt(i));
        }
    }
}
