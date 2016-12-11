package December.Assignment7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andrewrusso on 12/9/16.
 */
public class main {
    static Scanner scan = new Scanner(System.in);
    public static void main (String []args)
    {
        int b = scan.nextInt();
        int [] arr = convertToBinary(b);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int[] convertToBinary(int b)
    {
        String strings = Integer.toBinaryString(b);
        int[] arr = Arrays.stream(strings.substring(1, strings.length()-1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        return arr;
    }
    public static void printBin(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int[] addBin(int a[], int b[])
    {

        return a;
    }
}
