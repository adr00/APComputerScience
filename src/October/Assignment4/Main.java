package October.Assignment4;
import java.util.Scanner;
import java.lang.String;
public class Main
{
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a tweet:");
        String tweet = scan.nextLine();
        int length = tweet.length();
        int atcount = 0;
        int hashcount = 0;
        boolean rt = true;
        if(length > 140)
        {
            int excess = length - 140;
            System.out.println("Excess Characters: " + excess);
        }
        else if(length <= 140) {
            if (tweet.indexOf("RT:") >= 0 || tweet.indexOf("rt:") >= 0 || tweet.indexOf("rT:") >= 0 || tweet.indexOf("Rt:") >= 0) {
                rt = true;
            } else if (tweet.indexOf("RT:") <=0 || tweet.indexOf("rt:") <=0 || tweet.indexOf("rT:") <=0 || tweet.indexOf("Rt:") <=0)
            {
                rt = false;
            }
            for( int i=0; i<(tweet.length() -1); i ++ )
            {
                if( tweet.charAt(i) == '@' && tweet.charAt(i+1) != ' ' && tweet.charAt(i+1) != '\t')
                {
                    atcount++;
                }
            }
            for( int i=0; i<(tweet.length()-1); i ++) {
                if( tweet.charAt(i) == '#' && tweet.charAt(i+1) != ' ' && tweet.charAt(i+1) != '\t')
                {
                    hashcount++;
                }
            }
            System.out.println("Length Correct");
            System.out.println("Number of Mentions: "+atcount);
            System.out.println("Number of Hashtags: "+hashcount);
            if(rt == true)
            {
                System.out.println("The input was a retweet.");
            }
            if(rt == false)
            {
                System.out.println("The input was not a retweet.");
            }
        }
    }
}
