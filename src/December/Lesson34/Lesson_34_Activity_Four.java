package December.Lesson34;

/**
 * Created by andrewrusso on 12/8/16.
 */
public class Lesson_34_Activity_Four {

        public static int findMin(int [] a)
        {
            int currentmin=99;
            for (int i=0;i<a.length;i++){
                if(a[i] < currentmin) {
                    currentmin = a[i];
                }
            }
            return currentmin;
        }

        public static void main(String[] args)
        {
            int[] nums = {1,2,3};
            int min= findMin(nums);
        }
}