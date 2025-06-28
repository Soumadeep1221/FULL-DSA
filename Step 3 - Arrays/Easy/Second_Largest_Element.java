import java.util.Scanner;
// import java.util.Arrays;

public class Second_Largest_Element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();


        // Brute Force Solution 

        // int slargest=Sort(arr);

        // System.out.println("The second largest element in the array is "+slargest);




        // Better Solution

        // int slarge=SecondLargestElement(arr);

        // System.out.println("The largest element in the array is "+slarge);




        // Optimal Solution

        int slarge=SecondLargestElement(arr);

        System.out.println("The largest element in the array is "+slarge);
    }


    // Brute Force Solution (The T.C of this process is O(nlog n+n)) [Extra +n to find the second largest number]

    // static int Sort(int[] arr)
    // {
    //     Arrays.sort(arr);
    //     int largest=arr[arr.length-1];
    //     int slargest=-1;
    //     for(int i=arr.length-2;i>=0;i--)
    //     {
    //         if(arr[i]!=largest)
    //         {
    //             slargest=arr[i];
    //             break;
    //         } 
    //     }
    //     return slargest;
    // }





    // Better Solution(The T.C of this process is O(n+n)=O(2n))

    // public static int SecondLargestElement(int[] arr)
    // {
    //     int large=LargestElement(arr);
    //     int slargest=-1; // As we are assuming that the array contains all positive integers. If not then we will use slargest=Integer.MIN_VALUE; which will holds the minimum value an int can have.
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]>slargest && arr[i]!=large)
    //             slargest=arr[i];
    //     }
    //     return slargest;
    // }
    // public static int LargestElement(int[] arr)
    // {
    //     int max=arr[0];
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]>max)
    //             max=arr[i];
    //     }
    //     return max;
    // }





    // Optimal Solution (The T.C of this process is O(n))
    
    public static int SecondLargestElement(int[] arr)
    {
        int largest=arr[0];
        int slargest=-1; // As we are assuming that the array contains all positive integers. If not then we will use slargest=Integer.MIN_VALUE; which will holds the minimum value an int can have.

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i]; 
            }
            else if(arr[i]<largest && arr[i]>slargest)
                slargest=arr[i];
        }
        return slargest;
    }
}