import java.util.Scanner;

public class Insertion_sort {
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

        // Insertion Sort

        InsertionSort(arr);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertionSort(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            int j=i;
            while (j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;  
            }
        }
    }
}
