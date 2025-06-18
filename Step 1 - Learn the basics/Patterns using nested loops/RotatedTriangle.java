// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// *
// **
// ***
// **
// *

public class RotatedTriangle {
    public static void nStarTriangle(int n) {
        for(int i=1;i<n*2;i++)
        {
            int op=i;
            if(i>n)
            {
                op=n*2-i;
            }
            for(int j=0;j<op;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
