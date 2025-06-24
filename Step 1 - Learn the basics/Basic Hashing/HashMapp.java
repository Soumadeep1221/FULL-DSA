import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[7];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The highest frequency of the element present in the array is "+mostFrequentElement(nums));
    }
    public static int mostFrequentElement(int[] nums)
    {
        int max=0,ele=0;
        Map<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> k:hp.entrySet()) // Here you can use "var" which is similar to "auto" in C++. Use "var" wisely as it has some limitions.
        {
            if(k.getValue()>max)
            {
                max=k.getValue();
                ele=k.getKey();
            }
        }
        return ele;
    }
}
