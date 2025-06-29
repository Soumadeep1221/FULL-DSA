import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[6];
        int arr2[]=new int[6];
    
        List<Integer> inte=new ArrayList<>();

        System.out.println("Enter the elements in the 1st array:-");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements in the 2nd array:-");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        sc.close();

        inte=Intersectionn(arr1,arr2);

        System.out.println("Union of the elements:-");
        for(int i=0;i<inte.size();i++)
        {
            System.out.print(inte.get(i)+" ");
        }
    }


    // Brute Force Solution

    // static List<Integer> Intersectionn(int[] arr1, int[] arr2)
    // {
    //     List<Integer> ele=new ArrayList<>();

    //     // My Way (T.c is O(n1*n2)[For Worst Case] and S.C(min(n1,n2)) where n1=Size of arr1, n2=Size of arr2)

    //     // int k=0;

    //     // for(int i=0;i<arr1.length;i++)
    //     // {
    //     //     for(int j=k;j<arr2.length;j++)
    //     //     {
    //     //         if(arr1[i]==arr2[j])
    //     //         {
    //     //             ele.add(arr1[i]);
    //     //             k=j+1;
    //     //             break;
    //     //         }
    //     //         if(arr2[j]>arr1[i])
    //     //             break;
    //     //     }
    //     // }
    //     // return ele;

    //     // Striver's Way (T.C is O(n1*n2)[For Worst Case] and S.C(n2+min(n1,n2)) where n1=Size of arr1, n2=Size of arr2 [We will always try to take the smaller size b/w arr1 and arr2 for vis[] array and to store the result it's always gonna be min(n1,n2)])

    //     int[] vis=new int[arr2.length];

    //     for(int i=0;i<arr1.length;i++)
    //     {
    //         for(int j=0;j<arr2.length;j++)
    //         {
    //             if(arr1[i]==arr2[j] && vis[j]==0)
    //             {
    //                 ele.add(arr1[i]);
    //                 vis[j]=1;
    //                 break;
    //             }
    //             if(arr2[j]>arr1[i])
    //                 break;
    //         }
    //     }
    //     return ele;
    // }




    // Optimal Solution (T.C is O(n1+n2)[For Worst Case] ans S.C is O(min(n1,n2)) where n1=Size of arr1 and n2=Size of arr2)
    static List<Integer> Intersectionn(int[] arr1,int[] arr2)
    {
        List<Integer> ele=new ArrayList<>();
        int i=0;
        int j=0;

        while (i< arr1.length && j<arr2.length)
        {
            if(arr1[i]>arr2[j])
                j++;
            else if(arr1[i]<arr2[j])
                i++;
            else
            {
                ele.add(arr1[i]);
                i++;
                j++;
            }    
        }
        return ele;
    }
}
