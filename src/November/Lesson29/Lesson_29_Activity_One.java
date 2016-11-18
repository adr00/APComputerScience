package November.Lesson29;

public class Lesson_29_Activity_One {

    public static String list[] = {"high", "every", "nearing", "checking", "food ", "stand", "value", "best", "energy", "add", "grand", "notation", "abducted", "food ", "stand"};

    public static void main(String[] args)
    {
        String highest = "";
        for(int i = 0; i < list.length; i++)
        {
            if (list[i].length() > highest.length())
            {
                highest = list[i];
            }
        }
        System.out.println(highest);
    }

}
