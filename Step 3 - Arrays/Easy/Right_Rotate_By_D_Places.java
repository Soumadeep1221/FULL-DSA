import java.util.Scanner;

public class Right_Rotate_By_D_Places {

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Original Array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

        System.out.println("Enter the place from where you want to rotate:-");
        int n=sc.nextInt();
        sc.close();

        Rotate_By_D_Places(arr,n);

        // Required Array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
   }


   // Brute Force Solution (In the process the T.C is O(d) + O(n-d) + O(d) = O(n+d) where d=Place to rotate  n=Size of the array)
//    public static void Rotate_By_D_Places(int[] arr,int n)
//    {
//         n=n%arr.length;

//         int diff=arr.length-n;

//         int[] temp=new int[diff];

//         for(int i=0;i<diff;i++)
//         {
//             temp[i]=arr[i];
//         }
//         for(int i=diff;i<arr.length;i++)
//         {
//             arr[i-diff]=arr[i];
//         }
//         for(int i=0;i<diff;i++)
//         {
//             arr[arr.length-diff+i]=temp[i];
//         }
//    }
   
   


   // Optimal Solution (In this process the T.C is O(d/2) + O((n-d)/2) + O(n/2) = O(n) where d=Place to rotate  n=Size of the array)
   public static void Rotate_By_D_Places(int[] arr,int n)
   {
        n=n%arr.length;

        int diff=arr.length-n;

        Reverse(arr,0,diff);
        Reverse(arr,diff,arr.length);
        Reverse(arr,0,arr.length);
   }

   public static void Reverse(int[] arr,int st,int end)
   {
        while (st<end)
        {
            int temp=arr[st];
            arr[st]=arr[end-1];
            arr[end-1]=temp;
            st++;
            end--;
        }

        // We are not using the below method to reverse the array because it will reverse the array only when start<end/2 but we might want to rotate from index 4 to 6 then it will be 4<3 so rotation will not happen at that time.
        
        // for(int i=st;i<end/2;i++)
        // {
        //     int temp=arr[i];
        //     arr[i]=arr[end-1-i];
        //     arr[end-1-i]=temp;
        // }
   }
}
