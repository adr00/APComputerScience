/**
 * Created by andrewrusso on 12/2/16.
 */
public class test {
    public static void mystery(String wo) {
        if (wo.length() > 0)
            mystery( wo.substring( wo.length() - 1));
        System.out.println(wo);
    }

    public static void main (String[]args)
    {
        String q = "adjective";
        String r = "stinky";

        System.out.println( q.charAt( r.indexOf ('t')));
    }
}
