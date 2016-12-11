package December.Lesson34;

/**
 * Created by andrewrusso on 12/8/16.
 */
public class Lesson_34_Activity_One
{
    public static void main (String[]args)
    {
        int [] nums = {1,2,3};
        int sum = sum(nums);
    }

    public static int sum(int[] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        return sum;
    }
}
