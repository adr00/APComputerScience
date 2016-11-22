package November.Lesson32;

/**
 * Created by andrewrusso on 11/22/16.
 */
public class Lesson_32_Activity_Two {
    public static void main(String [] args)
    {
        monthDays(8);
    }

    public static void monthDays(int i) {
        int days = 0;
        switch (i) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        System.out.println(days);
    }
}
