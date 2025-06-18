// Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// A
// A B
// A B C

public class IncreasingLetterTriangle {
    public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            char ch='A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
