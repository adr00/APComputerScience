package October.Lesson22;

/**
 * Created by andrewrusso on 10/24/16.
 */
import java.util.Scanner;
public class Lesson_22_Activity_Two {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String text;
        System.out.println("Enter a string: ");
        text = scan.nextLine();
        int num=0;
        String spaces ="";


        while (num < text.length()){
            System.out.println(spaces +(text.charAt(num)));
            num++;
            spaces+="\t";


        }

    }
}
