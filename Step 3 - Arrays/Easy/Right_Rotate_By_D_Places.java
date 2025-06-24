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

//         int[] temp=new int[n];

//         for(int i=0;i<n;i++)
//         {
//             temp[i]=arr[i];
//         }
//         for(int i=n;i<arr.length;i++)
//         {
//             arr[i-n]=arr[i];
//         }
//         for(int i=0;i<n;i++)
//         {
//             arr[arr.length-n+i]=temp[i];
//         }
//    }
   
   


   // Optimal Solution (In this process the T.C is O(d) + O(n-d) + O(n) = O(2n) where d=Place to rotate  n=Size of the array)
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
