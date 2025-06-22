import java.util.Scanner;

public class Recursive_Bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        // Recursive Bubble Sort

        // My Way
        // BubbleSort(arr,0);

        // Striver's way
        BubbleSort(arr,arr.length);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //My Way
    // public static void BubbleSort(int[] arr,int i) //Same here just a little tweak in concept
    //     int isSwap=0;
    //     if(i>arr.length-1)
    //         return;
    //     for(int j=0;j<arr.length-i-1;j++)
    //     {
    //         if(arr[j]>arr[j+1])
    //         {
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //             isSwap=1;
    //         }
    //     }

    //     if(isSwap==0) // Optimized approach (Reducing time complexity for the best case)
    //         return;

    //     BubbleSort(arr,i+1);
    // }

    //Striver's Way
    public static void BubbleSort(int[] arr,int n) // Understand the concept of Bubble Sort from the notes....Then it will be easy to understand the recursive bubble sort....It just replaced the outer loop with the recursive function....That's it nothing else
    {
        int isSwap=0;
        if(n==1)
            return;
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                isSwap=1;
            }
        }

        if(isSwap==0) // Optimized approach (Reducing time complexity for the best case)
            return;

        BubbleSort(arr,n-1);
    }
}
