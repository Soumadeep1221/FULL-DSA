// You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.



// A palindrome number is a number which reads the same both left to right and right to left.


// Examples:
// Input: n = 121

// Output: true

// Explanation: When read from left to right : 121.

// When read from right to left : 121.

// Input: n = 123

// Output: false

// Explanation: When read from left to right : 123.

// When read from right to left : 321.


public class Palindrome_No {
    public boolean isPalindrome(int n) {
        int nn=0;
        int dup=n;
        while(n>0)
        {
            int d=n%10;
            nn=nn*10+d;
            n/=10;
        }
        if(nn==dup)
            return true;
        else 
            return false;
    }
}
