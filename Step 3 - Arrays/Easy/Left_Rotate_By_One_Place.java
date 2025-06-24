import java.util.Scanner;

public class Left_Rotate_By_One_Place {

    // This is the Brute Force/Better/Optimal Solution whose T.C is O(n)...No better solution is there for this Q. And S.C is O(1).
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        // Original Array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        
        leftRotate(arr);

        // Required Array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void leftRotate(int[] arr)
    {
        int temp=arr[0];
        int i;
        for(i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[i-1]=temp;
    }
}