// Sam is curious about Alpha-Ramp, so he decided to create Alpha-Ramp of different sizes.

// An Alpha-Ramp is represented by a triangle, where alphabets are filled from the top in order.

// For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.

// Example:
// Input: ‘N’ = 3

// Output: 
// A
// B B
// C C C

public class Alpha_Ramp {
    public static void alphaRamp(int n) {
        int count=1;
        for(char i='A';i<'A'+n;i++)
        {   
            for(int j=0;j<count;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            count++;
        }
    }
}
