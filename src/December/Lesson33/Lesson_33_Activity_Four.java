package December.Lesson33;

/**
 * Created by andrewrusso on 12/5/16.
 */
public class Lesson_33_Activity_Four {
    public static void main(String[] args)
    {
        int num[] = {1,2,3,4,5,6,7,8,9};
        reverse(num);
    }
    public static void reverse(int []nums)
    {
        for(int i = 0; i < nums.length / 2; i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }
}
