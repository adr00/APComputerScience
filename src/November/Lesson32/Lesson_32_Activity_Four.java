package November.Lesson32;

/**
 * Created by andrewrusso on 11/22/16.
 */
public class Lesson_32_Activity_Four
{
    public static void main (String [] args)
    {
        realTime(6342);
    }

    public static void realTime(int i)
    {
        int hours = i/3600;
        int remain1 = i%3600;
        int minutes = remain1/60;
        int remain2 = remain1%60;
        int seconds = remain2;
        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+minutes);
        System.out.println("Seconds: "+seconds);
    }
}
