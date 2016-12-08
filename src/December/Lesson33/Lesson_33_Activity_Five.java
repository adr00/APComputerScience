package December.Lesson33;

/**
 * Created by andrewrusso on 12/7/16.
 */
public class Lesson_33_Activity_Five {
    public static void main(String [] args)
    {
        int [] b = {1,2,3,4,5,6,7,8,9};
        insertValue(b, 100, 0);
    }
    public static void insertValue(int[] a, int change, int index)
    {
        a[index] = change;
    }
}
