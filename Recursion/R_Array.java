import java.util.*;

public class R_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:-");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements int the array:-");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sc.close();
        revarr(arr,n,0);
        System.out.println("Output:-");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    // 1) If I use one extra array to store the reversed array --> Here the T.C = O(N) but the S.C wil be more in this case as I am using an extra array to reverse.


    public static void revarr(int[] arr,int n,int i)  // 2) Here the T.C = O(N/2)= O(N) (Because in Big-O-Notation we generally ignore the constant factors) but the S.C wil be less in this case as I am not using an extra array to reverse. i.e S.C -> O(N)
    {
        if(i==n/2) // You can give i>=n/2 it doesn't matter
            return;
        else
        {
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=temp;
            revarr(arr,n,i+1);
        }
    }
}


// public static void revarr(int[] arr, int n) { // 3) Here only the array and the it's size are passed. T.C = O(N/2)= O(N) =S.C
//         int size = arr.length;
//         int i = size - n;
//         int j = n - 1;

//         if (i >= j) return; // You can give i>=n/2 it doesn't matter

//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;

//         revarr(arr, n - 1);
//     }