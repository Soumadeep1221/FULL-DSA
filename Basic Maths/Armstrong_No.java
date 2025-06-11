// You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.



// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.


// Examples:
// Input: n = 153

// Output: true

// Explanation: Number of digits : 3.

// 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27 = 153.

// Therefore, it is an Armstrong number.

// Input: n = 12

// Output: false

// Explanation: Number of digits : 2.

// 1 ^ 2 + 2 ^ 2 = 1 + 4 = 5.

// Therefore, it is not an Armstrong number.


public class Armstrong_No {
    public boolean isArmstrong(int n) {
        int count=0,sum=0;
        int dup=n;
        int dup1=n;
        while(n>0)
        {
            count++;
            n/=10;
        }
        while(dup>0)
        {
            int j=dup%10;
            int pow=1;
            for(int i=1;i<=count;i++)
            {
                pow*=j;
            }
            sum+=pow;
            dup/=10;
        }
        if(dup1==sum)
            return true;
        else
            return false;
    }
}
