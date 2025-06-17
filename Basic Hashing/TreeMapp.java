import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to get the frequency of it:-");
        int n=sc.nextInt();
        sc.close();

        Map<Integer,Integer> tp=new TreeMap<>(); // similar to map<int,int> mpp;

        for(int i=0;i<arr.length;i++)
        {
            tp.put(arr[i],tp.getOrDefault(arr[i],0)+1);
        }
        System.out.println("The frequency of "+n+" is "+tp.getOrDefault(n,0));
    }
}
