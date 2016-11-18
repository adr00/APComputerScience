package November.Lesson30;
public class Lesson_30_Activity {
    public static String [] list = {};

    public static void main(String[] args)
    {
        for(int i = 0; i < list.length; i++)
        {
            list[i] = list[i].replaceAll(" ","");
        }
    }
}
