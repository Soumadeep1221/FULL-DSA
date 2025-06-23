import java.util.Scanner;

public class Largest_Element
{
    // Brute Force Solution (The T.C of this process is O(nlog n))
    // public static void main(String[] args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int arr[]=new int[6];
    //     System.out.println("Enter the elements in the array:-");
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     sc.close();

    //     // Merge Sort

    //     MergeSort(arr,0,5);

    //     System.out.println("The largest element in the array is "+arr[arr.length-1]);
    // }
    // public static void Merge(int[] arr,int low,int mid,int high)
    // {
    //     int i=low;
    //     int j=mid+1;
    //     int[] temp=new int[arr.length];
    //     int count=0;
    //     while (i<=mid && j<=high)
    //     {
    //         if(arr[i]>=arr[j])
    //         {
    //             temp[count]=arr[j];
    //             j++;
    //         }
    //         else
    //         {
    //             temp[count]=arr[i];
    //             i++;
    //         }
    //         count++;
    //     }
    //     while (i<=mid) // If extra elemnents are left in the left sub-array.
    //     {
    //        temp[count]=arr[i];
    //         i++;
    //         count++;
    //     }

    //     while (j<=high) // If extra elements are left in the right sub-array.
    //     {
    //         temp[count]=arr[j];
    //         j++;
    //         count++;
    //     }

    //     for(int k=low;k<=high;k++)
    //     {
    //         arr[k]=temp[k-low];
    //     }
    // }
    // public static void MergeSort(int[] arr,int low,int high)
    // {
    //     if(low>=high) // You can also give '==' instead of '>='.Using this just to be safe.
    //         return;
    //     int mid=(low+high)/2;
    //     MergeSort(arr, low, mid);
    //     MergeSort(arr,mid+1,high);
    //     Merge(arr,low,mid,high);
    // }




    // Better Solution(There is no better solution than this as it's T.C is O(nlog n)) [We are not thinking about the S.C so either of the sorting processes can be used]




    // Optimal Solution (The T.C of this process is O(n))
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        int large=LargestElement(arr);

        System.out.println("The largest element in the array is "+large);
    }
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