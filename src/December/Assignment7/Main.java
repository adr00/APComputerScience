package December.Assignment7;

import java.util.Scanner;

public class Main
{

    private static boolean loo = false;

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        int a = scan.nextInt();
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        int b = scan.nextInt();

        int[] arr = convertToBinary(a);
        int[] arr2 = convertToBinary(b);

        System.out.println("First binary number:");
        printBin(arr);
        System.out.println("Second binary number:");
        printBin(arr2);

        System.out.println("Added:");
        if ((a + b) > 255)
        {
            System.out.println("Error: overflow");
            loo = true;
        }
        printBin(addBin(arr, arr2));
    }

    public static int[] convertToBinary(int b)
    {
        String strings = Integer.toBinaryString(b);
        int[] arr = new int[8];

        boolean useString = false;
        if (strings.length() < arr.length) useString = true;

        for (int i = 0; i < (useString ? strings.length() : arr.length); i++)
        {
            arr[i + (8 - strings.length())] = Integer.parseInt(String.valueOf(strings.charAt(i)));
        }

        return arr;
    }

    public static void printBin(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int[] addBin(int a[], int b[])
    {
        boolean useA = false;
        if (a.length < b.length) useA = true;

        int[] result = new int[(useA ? a.length : b.length)];

        for (int i = 0; i < (useA ? a.length : b.length); i++)
        {
            if (a[i] == 1 || b[i] == 1)
                result[i] = 1;
            else
                result[i] = 0;
        }

        if (loo)
        {
            result[0] = 0;
            loo = false;
        }

        return result;
    }
}
