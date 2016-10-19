package October.Lesson20;

/**
 * Created by andrewrusso on 10/18/16.
 */
import java.util.Scanner;
import java.lang.Math;
class Lesson_20_Activity{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        double north = -90.0;
        double south = 90.0;
        double east = -180.0;
        double west = 180.0;
        double x = 1;

        while( x == 1)
        {
            System.out.println("Please enter a latitude: ");
            double latitude = scan.nextDouble();
            System.out.println("Please enter a longitude: ");
            double longitude = scan.nextDouble();
            if (((lat > 90.00)||(lat < -90.00))||((lon > 180.00)||(lon < -180.00)))
            {
                System.out.println("Incorrect Latitude or Longitude");
                latitude = 0;
                longitude=0;}
            else
                System.out.println("Would you like to enter another location? ");
                x = scan.nextDouble();



            if (latitude >= north)
                    north = lat;
            if (latitude <= south)
                    south = lat;
            if (longitude >= east)
                    east = lon;
            if (longitude <= west)
                    west = lon;

            }
            if (north<=90&&south>=-90&&east<=180&&west>=-180)
            {
                System.out.println("Farthest North: " + north);
                System.out.println("Farthest South: " + south);
                System.out.println("Farthest East: " + east);
                System.out.println("Farthest West: " + west);
            }
        }
}

