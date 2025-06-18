// You are given an integer n. You need to return the number of digits in the number.



// The number will have no leading zeroes, except when the number is 0 itself.


// Examples:
// Input: n = 4

// Output: 1

// Explanation: There is only 1 digit in 4.

// Input: n = 14

// Output: 2

// Explanation: There are 2 digits in 14.


public class Count_Digits {
    public int countDigit(int n) {
        int count=0;
        while(n>0)
        {
        //  int d=n%10; //This part is not required for digit count.
            count++;
            n=n/10;
        }
        return count;
    }
}

//T.C here is O(log10(N)) because the number is dividing by 10 (Whenever any division is there in code log part will come in T.C)