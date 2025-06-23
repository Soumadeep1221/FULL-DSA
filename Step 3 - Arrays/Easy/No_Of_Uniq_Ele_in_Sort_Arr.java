import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class No_Of_Uniq_Ele_in_Sort_Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        int Uniq_Ele=UniqueElement(arr);
        System.out.println("The no. of unique elements int the sorted array is "+Uniq_Ele);
    }
    public static int UniqueElement(int[] arr)
    {
        Set<Integer> ts=new TreeSet<>(); // Similar to set<int> ts;

        for(int i=0;i<arr.length;i++)
            ts.add(arr[i]);
        
            int index=0;
        for(int s:ts)
        {
            arr[index]=s;
            index++;
        }
        return index;
    }
}
