package December.Lesson33;
import java.lang.String;

/**
 * Created by andrewrusso on 11/29/16.
 */
public class Lesson_33_Activity_One {
    public static void main(String []args)
    {
        String [] arr1 = {"sdfasdfa","afsdfasdfa"};
        upper(arr1);
    }
    public static void upper(String [] i){
        for(int j = 0; j < i.length; j++ )
        {
            i[j] = i[j].toUpperCase();
        }


    }
}
