// You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.



// A number which completely divides another number is called it's divisor.


// Examples:
// Input: n = 6

// Output = [1, 2, 3, 6]

// Explanation: The divisors of 6 are 1, 2, 3, 6.

// Input: n = 8

// Output: [1, 2, 4, 8]

// Explanation: The divisors of 8 are 1, 2, 4, 8.


import java.util.*;

public class Print_Divisors {
    public int[] divisors(int n)
    {
        List<Integer> ls= new ArrayList<>(); // similar to vector
        // Loop is running Math.sqrt(n) times i.e O(Math.sqrt(n))
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                ls.add(i); // similar to push_back();
                if((n/i)!=i)
                    ls.add(n/i);
            }
        }
        // O(n log n) where n=no. of factors in list
        
        // log n levels (splits) i.e. here the sort() function is more or less similar to merge sort which means divide and conquer.

        // n work per level

        // Total Work = n × log n = O(n log n)
        Collections.sort(ls); // similar to sort();

        int[] res=new int[ls.size()];
        for(int i=0;i<ls.size();i++) // O(n) where n=no. of factors in list
            res[i]=ls.get(i); // similar to *it or v[0] if v is a vector
        return res;
    }
}
