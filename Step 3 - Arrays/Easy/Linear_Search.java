import java.util.Scanner;

class Linear_Search
{
    // This is the Brute Force/Better/Optimal Solution whose T.C is O(n) for worst case...No better solution is there for this Q.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to find the index:-");
        int n=sc.nextInt();

        sc.close();

        int idx=LinearSearch(arr,n);

        if(idx!=-1)
            System.out.println("The index of "+n+" is "+idx);
        else
            System.out.println("The "+n+" doesn't exist in the array.");
    }
    public static int LinearSearch(int[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                return i;
        }
        return -1;
    }
}