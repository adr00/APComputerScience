/**
 * Created by andrewrusso on 12/2/16.
 */
import java.util.ArrayList;
public class test {

    public static void main (String[]args)
    {
        ArrayList<test> bulbs = new ArrayList<test>();
        bulbs.add(new test());
        bulbs.remove(0);
        bulbs.add(new test());
        test b = new test();
        bulbs.add(1, b);
        bulbs.add(new test());
        bulbs.remove(0);
        bulbs.add(new test());
        bulbs.remove(2);
        bulbs.remove(1);
        bulbs.add(new test());

        System.out.println(bulbs.size());
    }
}
