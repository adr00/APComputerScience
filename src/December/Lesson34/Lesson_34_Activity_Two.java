package December.Lesson34;

/**
 * Created by andrewrusso on 12/8/16.
 */
public class Lesson_34_Activity_Two
{
    public static void main (String[]args)
    {
        int [] nums = {1,4,3};
        double average = average(nums);
    }

    public static double average(int[] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        double average = sum/nums.length;
        return average;
    }
}

