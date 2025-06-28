import java.util.ArrayList;
// import java.util.TreeSet;
import java.util.List;
import java.util.Scanner;
// import java.util.Set;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[6];
        int arr2[]=new int[6];
    
        List<Integer> uni=new ArrayList<>();

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

        uni=Unionn(arr1,arr2);

        System.out.println("Union of the elements:-");
        for(int i=0;i<uni.size();i++)
        {
            System.out.print(uni.get(i)+" ");
        }
    }


    // Brute Force Solution (T.C is O(n1log n) + O(n2log n) + O(n1+n2)[For Worst Case]= O(n1log n+n2log n+n1+n2) and S.C is O(n1+n2)[For worst case] where n1=Size of arr1, n2=Size of arr2, n=Size of set)
    
    // static List<Integer> Unionn(int[] arr1,int[] arr2)
    // {
    //     List<Integer> ele=new ArrayList<>();
    //     Set<Integer> st=new TreeSet<>();

    //     for(int i=0;i<arr1.length;i++)
    //     {
    //         st.add(arr1[i]);
    //     }
    //     for(int i=0;i<arr2.length;i++)
    //     {
    //         st.add(arr2[i]);
    //     }

    //     for (Integer i:st)
    //     {
    //         ele.add(i);
    //     }
    //     return ele;
    // }




    // Optimal Solution (T.c is O(n1+n2) as we are pointing to each elements in both the arrays for once and S.C is O(n1+n2)[For worst case])

    static List<Integer> Unionn(int[] arr1,int[] arr2)
    {
        List<Integer> uni=new ArrayList<>();
        int i=0;
        int j=0;

        while (i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(uni.size()==0 || uni.get(uni.size()-1)!=arr1[i])
                    uni.add(arr1[i]);
            i++;
            }
            else
            {
                if(uni.size()==0 || uni.get(uni.size()-1)!=arr2[j])
                    uni.add(arr2[j]);
            j++;
            }
        }

        while (i<arr1.length)
        {
            if(uni.get(uni.size()-1)!=arr1[i])
            {
                uni.add(arr1[i]);
            }
        i++;
        }
        
        while (j<arr2.length)
        {
            if(uni.get(uni.size()-1)!=arr2[j])
            {
                uni.add(arr2[j]);
            }
        j++;
        }

        return uni;
    }
}