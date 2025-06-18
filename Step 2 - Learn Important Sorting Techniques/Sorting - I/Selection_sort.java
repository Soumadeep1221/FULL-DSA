import java.util.Scanner;

public class Selection_sort {
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

        // Selection Sort

        SelectionSort(arr);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelectionSort(int arr[])
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            int min=i;

            // Finding mimimum value
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }    
            }

            // Swapping
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}