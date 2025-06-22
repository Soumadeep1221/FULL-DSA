import java.util.Scanner;

public class Recursive_Insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        // Recursive Insertion Sort

        InsertionSort(arr,0);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void InsertionSort(int[] arr,int i) // Understand the concept of Insertion Sort from the notes....Then it will be easy to understand the recursive insertion sort....It just replaced the outer loop with the recursive function....That's it nothing else
    {
        if(i>arr.length-1)
            return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j])
        {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        InsertionSort(arr, i+1);
    }
}
