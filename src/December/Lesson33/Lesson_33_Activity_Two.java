package December.Lesson33;
/**
 * Created by andrewrusso on 11/29/16.
 */
public class Lesson_33_Activity_Two {
    public static void main(String [] args)
    {
        int num[] = new int[10000];
        randomize(num);
    }
    public static void randomize(int num[])
    {
        for(int j = 0; j < num.length; j++)
        {
            num[j] = (int)(Math.random()*90) + 10;
            if (num[j] < 11 || num[j] > 98) System.out.println("Outside range!: " + num[j]);
        }
    }
}
