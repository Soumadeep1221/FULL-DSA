// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

// Example:
// Input: ‘N’ = 3

// Output: 

//   *
//  ***
// *****
// *****
//  ***
//   *

public class StarDiamond {
    public static void nStarDiamond(int n) {
        for(int i=0;i<n;i++)
        {
            for(int a=0;a<n-i-1;a++)
            {
                System.out.print(" ");
            }
            for(int b=0;b<i*2+1;b++)
            {
                System.out.print("*");
            }
            for(int c=0;c<n-i-1;c++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int a=0;a<i;a++)
            {
                System.out.print(" ");
            }
            for(int b=0;b<n*2-i*2-1;b++)
            {
                System.out.print("*");
            }
            for(int c=0;c<i;c++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
