 package October.Lesson24;

/**
 * Created by andrewrusso on 10/24/16.
 */
public class Lesson_24_Activity_One {
    public static void main(String [] args)
    {
        int print = 0;
        for(int i = 23; i <= 89; i++)
        {
            ++print;
            System.out.print(i + (print%10==0?"\n":" "));

        }
    }
}
