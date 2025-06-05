// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// *****
//  ***
//   *

public class ReverseStarTriangle {
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<n*2-2*i-1;k++)
            {
                System.out.print("*");
            }
            for(int l=0;l<i;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
