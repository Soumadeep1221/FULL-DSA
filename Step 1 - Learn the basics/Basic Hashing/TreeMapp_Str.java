import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapp_Str {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:-");
        String str=sc.nextLine();
        System.out.println("Enter a character to get the frequency of it:-");
        char ch=sc.next().charAt(0);
        sc.close();

        Map<Character,Integer> tp=new TreeMap<>(); // similar to map<char,int> mpp; // here character itself stores as a key not its ASCII value

        // Pre-compute o Pre-storing
        for(int i=0;i<str.length();i++)
        {
            tp.put(str.charAt(i),tp.getOrDefault(str.charAt(i),0)+1); // similar to mpp[str[i]]++;
        }

        // TreeMap is similar to ordered map in C++ and the below loop will give you the prove.

        // iterate in the map
        for(Map.Entry<Character,Integer> k:tp.entrySet()) // similar to for(auto it:mpp)
        {
            System.out.println(k.getKey()+" -> "+k.getValue()); // similar to cout << it.first << "->" << it.second <<endl;
        }

        //Fetching
        System.out.println("The frequency of "+ch+" is "+tp.getOrDefault(ch,0)); // similar to cout << mpp[ch];
    }
}