// You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.



// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.


// Examples:
// Input: n1 = 4, n2 = 6

// Output: 2

// Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

// Greatest Common divisor = 2.

// Input: n1 = 9, n2 = 8

// Output: 1

// Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.

// Greatest Common divisor = 1.


public class GCDorHCF {
    public static int GCD(int n1, int n2) {
        int m=Math.min(n1,n2),res=0;
        for(int i=m;i>=1;i--) // This loop is running from the back so in most of the cases it will work efficiently but in worst case it will be O(Math.sqrt(n1,n2)) irrespective of forward or backward run by the loop like in n1=11, n2=13. 
        {
            if(n1%i==0 && n2%i==0)
            {
                res=i;
                break;
            }
        }
        return res;
    }
}

// To run the code

//     public static void main(String[] args)
//     {
//         System.out.println(GCD(13,11));
//     }
// }


// Euclidean Algorithm (VERY IMP)


// public static int GCD(int n1, int n2)
// {
//         while(n1>0 && n2>0)
//         {
//             if(n1>n2)
//                 n1%=n2;
//             else
//                 n2%=n1;
//         }
//         if(n1==0)
//             return n2;
//         return n1;
//     }


    // For CP
//     public static int GCD(int a, int b) { //Widely used in CP
//     while (b != 0) {
//         int temp = b;    STEP 1: a=28,b=18 STEP 2:-a=18,b=10 and so on.....
//         b = a % b;
//         a = temp;
//     }
//     return a;
// }