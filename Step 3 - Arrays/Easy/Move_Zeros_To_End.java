import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Move_Zeros_To_End {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        Zeros_To_Right(arr);

        // Printing
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    // Brute Force Solution (In this process the T.C is O(n) + O(x) + O(n-x) = O(2n) and S.C is O(x) for worst case -> O(n) i.e when no zero elements in present in the ArrayList where x=No of non-zero elements)

    // public static void Zeros_To_Right(int[] arr)
    // {
    //     List<Integer> temp=new ArrayList<>(); // Using ArrayList as Array is taking little bit more space. How ?? Watch properly
    //     // int[] temp=new int[arr.length];
    //     // int j=0;

    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]!=0)
    //         {
    //             temp.add(arr[i]);
    //             // temp[j]=arr[i];
    //             // j++;
    //         }
    //     }
    //     for(int i=0;i<temp.size();i++)
    //     {
    //         arr[i]=temp.get(i);
    //     }
    //     for(int i=temp.size();i<arr.length;i++)
    //     {
    //         arr[i]=0;
    //     }
    // }




    // Optimal Solution (In ths process the T.C is O(x) + O(n-x) = O(n) and S.C is O(1) where x=length of the array till the first zero)

    public static void Zeros_To_Right(int[] arr)
    {
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}