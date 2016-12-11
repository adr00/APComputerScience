package December.Lesson34;

/**
 * Created by andrewrusso on 12/8/16.
 */
class Lesson_34_Activity_Three {

    public static int findMax(int [] a)
    {
        int currentmax=0;

        for (int i=0;i<a.length;i++){
            if(a[i] > currentmax) {
                currentmax = a[i];
            }
        }
        return currentmax;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3};
        int max = findMax(nums);
    }
}