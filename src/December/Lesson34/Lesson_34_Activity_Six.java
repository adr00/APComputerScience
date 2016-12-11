package December.Lesson34;
class Lesson_34_Activity_Six {

    public static boolean allPositive(int [] a)
    {
        boolean pos = true;
        for(int i = 0; i < a.length; i++) {
            if(Math.abs(a[i]) != a[i]) {
                pos = false;
            }

        }
        return pos;
    }

    public static void main(String[] args)
    {
        int [] nums = {3,3,3,3,3,3};
        boolean pos = allPositive(nums);

    }
}