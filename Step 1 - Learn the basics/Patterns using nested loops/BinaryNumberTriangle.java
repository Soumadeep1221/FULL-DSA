// Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

// You are required to print the pattern as shown in the examples below.

// Example:
// Input: ‘N’ = 3

// Output: 

// 1
// 0 1
// 1 0 1

public class BinaryNumberTriangle {
    public static void nBinaryTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            int st=1;
            if(i%2==0)
            {
                st=0;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(st+" ");
                st=1-st;
            }
            System.out.println();
        }
    }
}
