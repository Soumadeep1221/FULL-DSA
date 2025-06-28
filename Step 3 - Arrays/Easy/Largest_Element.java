import java.util.Arrays;
import java.util.Scanner;

public class Largest_Element
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

        // int largest_Ele=Sort(arr);

        // System.out.println("The largest element in the array is "+largest_Ele);




        // Better Solution(There is no better solution than this as it's T.C is O(nlog n)) [We are not thinking about the S.C so either of the sorting processes can be used]




        // Optimal Solution

        int large=LargestElement(arr);

        System.out.println("The largest element in the array is "+large);
    }


    // Brute Force Solution (The T.C of this process is O(nlog n))

    // static int Sort(int[] arr)
    // {
    //     Arrays.sort(arr);
    //     return arr[arr.length-1];
    // }




    // Optimal Solution (The T.C of this process is O(n))

    public static int LargestElement(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}