import java.util.Scanner;

public class Is_Sorted_Or_Not
{
    // This is the Brute Force/Better/Optimal Solution whose T.C is O(n)...No better solution is there for this Q.
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

        boolean Is_Sorted=Issorted(arr);

        if(Is_Sorted)
            System.out.println("The given array is sorted.");
        else
            System.out.println("The given array is not sorted.");
    }
    public static boolean Issorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
                continue;
            else   
                return false;
        }
        return true;
    }
}
