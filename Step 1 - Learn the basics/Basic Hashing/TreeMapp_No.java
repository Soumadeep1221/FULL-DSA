import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapp_No {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            // tp.put(arr[i],tp.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Enter the number to get the frequency of it:-");
        int n=sc.nextInt();
        sc.close();

        Map<Integer,Integer> tp=new TreeMap<>(); // similar to map<int,int> mpp;

        // Pre-compute o Pre-storing
        for(int i=0;i<arr.length;i++)
        {
            tp.put(arr[i],tp.getOrDefault(arr[i],0)+1); // similar to mpp[arr[i]]++;
        }

        // TreeMap is similar to ordered map in C++ and the below loop will give you the prove.

        // iterate in the map
        for(Map.Entry<Integer,Integer> k:tp.entrySet()) // similar to for(auto it:mpp)
        {
            System.out.println(k.getKey()+" -> "+k.getValue()); // similar to cout << it.first << "->" << it.second <<endl;
        }

        //Fetching
        System.out.println("The frequency of "+n+" is "+tp.getOrDefault(n,0)); // similar to cout << mpp[n];
    }
}

// If here the T.C -> O(n+n)=O(2n) equivalent to O(n) as we know that we ignore the constants....Here one 'n' is of taking input and another for inserting array elements frequencies in TreeMap.Though we can do both of them in one loop as shown above in line 12-13 but that will not differ very much if it was O(n*n) and then after doing modifications the T.C was O(n) then that modification can be considered as an effective optimization.

// getOrDefault(A,0) ==> The basic process of this function (here A is the key and zero is the default value)

                        // if(tp.get(A)==null)
                        //     tp.get(A)=0;

// The actual T.C of TreeMap while for storing or fetching is O(log n)(In all cases i.e Best,Avg,Worst)(where n is the no. of elements in the map) because it is is usually implemented using a Red-Black Tree, which is a kind of self-balancing binary search tree.(This is the reason why we are getting keys in ordered form)