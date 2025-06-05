// Sam is curious about symmetric patterns, so he decided to create one.

// For every value of ‘N’, return the symmetry as shown in the example.

// Example:
// Input: ‘N’ = 3

// Output: 
// *         *
// * *     * *
// * * * * * *
// * *     * *
// *         *

public class Symmetry {
    public static void symmetry(int n) {
        for(int i=1;i<=2*n-1;i++)
        {
            int stars=i;
            int space=2*n-2*i;
            if(i>n)
            {
                stars=2*n-i;
                space=2*i-2*n;
            }
            for(int j=1;j<=stars;j++)
            {
               System.out.print("* ");
               
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++)
            {
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}
