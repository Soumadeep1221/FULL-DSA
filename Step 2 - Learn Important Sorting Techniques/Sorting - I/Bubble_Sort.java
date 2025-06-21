import java.util.Scanner;
public class Bubble_Sort
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

        // Bubble Sort

        BubbleSort(arr);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int[] nums)
    {
        for(int i=0;i<=nums.length-1;i++)
        {
            boolean isSwap=false;
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    isSwap=true; // This line is to reduce the time complexity i.e if the given array is already sorted then the T.C will be O(n) not O(n^2).
                }
            }
            if(isSwap==false) // Same here
                break;        // Same here
        }
    }
}