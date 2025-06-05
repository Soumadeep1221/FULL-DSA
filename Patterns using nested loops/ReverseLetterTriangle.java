// Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

// You must print a matrix corresponding to the given Reverse Letter Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// A B C
// A B
// A

public class ReverseLetterTriangle {
    public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            for(char j='A';j<'A'+n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
