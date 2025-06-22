import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        // Merge Sort

        QuickSort(arr,0,5);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j)
        {
            while (arr[i]<=pivot && i<=high-1) // Using high-1 instead of high because of post increment of i
                i++;
            while (arr[j]>pivot && j>=low+1) // Same reason here
                j--;
            if(i<j) // Remember that i will never be equal to j, either i>j or i<j as everytime the overloop will happen in each cases. This thing is verified my me as well....No need to waste time to think about this.
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        
        return j;
    }

    public static void QuickSort(int[] arr,int low,int high)
    {
        if(low < high)
        {
            int pIndex=partition(arr,low,high);
            QuickSort(arr,low,pIndex-1);
            QuickSort(arr,pIndex+1,high);
        }
    }
}