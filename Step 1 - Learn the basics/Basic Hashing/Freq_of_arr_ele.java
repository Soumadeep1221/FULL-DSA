import java.util.*;

public class Freq_of_arr_ele {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[11];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to get the frequency of it:-");
        int n=sc.nextInt();
        sc.close();

        // Hashing (Takes much less time than previous process) i.e Number Hashing

        // Pre-compute or Pre-storing
        int hash[]=new int[11];
        for(int i=0;i<5;i++)
        {
            hash[arr[i]]+=1;
        }

        // Fetching
        System.out.println("The frequency of "+n+" is "+hash[n]); 
    }
}
    // According to you this will be your 1st approach but this process eventually end up taking lots of time.


    // public static int Freq_No(int arr[],int n)
    // {
    //     int cc=0;
    //     for(int i=0;i<5;i++)
    //     {
    //         if(arr[i]==n)
    //             cc++;
    //     }
    //     return cc;
    // }