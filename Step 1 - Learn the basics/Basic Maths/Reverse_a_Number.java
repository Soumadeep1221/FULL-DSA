// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.


// Examples:
// Input: n = 25

// Output: 52

// Explanation: Reverse of 25 is 52.

// Input: n = 123

// Output: 321

// Explanation: Reverse of 123 is 321.


public class Reverse_a_Number {
    public int reverseNumber(int n) {
        int nn=0;
        while(n>0)
        {
            int d=n%10;
            nn=nn*10+d;
            n=n/10;
        }
        return nn;
    }
}
