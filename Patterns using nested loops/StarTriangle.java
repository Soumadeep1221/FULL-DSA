// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

//   *
//  ***
// *****

public class StarTriangle {
        public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++)
            {
                System.out.print("*");
            }
            for(int l=0;l<n-i-1;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
