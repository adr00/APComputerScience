package October.Assignment4;
import java.util.Scanner;
public class Main
{
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a tweet:");
        String tweet = scan.nextLine();
        int length = tweet.length();
        if(length > 140)
        {
            int excess = length - 140;
            System.out.println("Excess Characters: " + excess);
        }
        else if(length <= 140)
        {
        }

    }

}
