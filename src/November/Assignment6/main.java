package November.Assignment6;

import java.util.Scanner;

public class main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int check1=1;
        int check2=1;
        int[] array1 = new int[10000];
        int count = 0;
        int input = 0;
        System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
        while(count < 100000)
        {

            input = scan.nextInt();
            if(input > 0)
                array1[count] = input;
            else if (input <= 0)
                break;
            count++;
        }
        int cleanlength;

    }
    public static void cleanup(int[] i)
    {
        int lastreal;
        for(int j=0; j < i.length; j++)
        {
            if( i[j] <= 0){
                lastreal = j;
                break;
            }

        }


    }
}
