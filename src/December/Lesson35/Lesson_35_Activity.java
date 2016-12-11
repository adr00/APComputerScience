package December.Lesson35;

/*
 * Lesson 35 Coding Activity
 *
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 *
 * Write four overloaded methods called randomize.
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters.
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter.
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters.
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter.
 *
 * Because these methods are overloaded, they should be declared in the same class.
 * To simulate this, copy all four methods into the single Code Runner box.
 */
public class Lesson_35_Activity {

    static Lesson_35_Activity lesson35 = new Lesson_35_Activity();
    public static int randomize(int a, int b) {return(int) (Math.random() * ((b-a)+1) + a);}
    public static int randomize(int a) {return (int)(Math.random()*(a + 1));}
    public static double randomize(double a, double b) {return Math.random()*(b-a) + a;}
    public static double randomize(double a) {return Math.random()*(a);}
    public static void main(String[]args)
    {
        int a = 3;
        int b = 7;
        double c = 3.0;
        double d = 7.0;
        int e = lesson35.randomize(a,b);
        int f = lesson35.randomize(b);
        double g = lesson35.randomize(c,d);
        double h = lesson35.randomize(d);
    }
}
