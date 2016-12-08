package December.Lesson33;

/**
 * Created by andrewrusso on 12/1/16.
 */
public class Lesson_33_Activity_Three {

    public static void printit(int[] num)
    {
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] +" ");
        }
    }

    public static void main(String[] args)
    {
     int num[] = {1,2,3,4,5,6,7,8,9};
        printit(num);
    }
}
