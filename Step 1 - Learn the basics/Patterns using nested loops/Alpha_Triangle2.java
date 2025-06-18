// Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.

// An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.

// For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 
// C
// C B 
// C B A

public class Alpha_Triangle2 {

    public static void alphaTriangle(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - 1); // Last character to print (e.g., 'E' if n = 5)
            for (char j = (char)(ch - i); j <= ch; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        alphaTriangle(n);
    }
}

