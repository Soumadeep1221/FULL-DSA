// You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.



// A prime number is a number which has no divisors except 1 and itself.


// Examples:
// Input: n = 5

// Output: true

// Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

// Input: n = 8

// Output: false

// Explanation: The divisors of 8 are 1, 2, 4, 8, thus it is not a prime number.


public class Prime {
    public boolean isPrime(int n) {
        int ct=0;
        for(int i=1;i<=Math.sqrt(n);i++) // T.C-> O(Math.sqrt(n))
        {
            if(n%i==0)
            {
                ct++;
                if((n/i)!=i)
                    ct++;
            }
        }
        if(ct==2) // This part can be ignored as it is considered as run in constant time.
            return true;
        else 
            return false;
    }
}
