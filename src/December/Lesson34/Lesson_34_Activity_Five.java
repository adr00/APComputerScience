package December.Lesson34;

/**
 * Created by andrewrusso on 12/8/16.
 */
public class Lesson_34_Activity_Five {

        public static int sumEven(int [] a)
        {
            int sum = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i]%2 == 0) {
                    sum += a[i];
                }

            }
            return sum;
        }

        public static void main(String[] args)
        {
            int [] nums = {3,2,3,3,3,3};
            int sum = sumEven(nums);

        }
    }
