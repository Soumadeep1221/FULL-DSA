import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        sc.close();
        int fac=NFactorial(n);
        System.out.println("The factorial of "+n+":- "+fac);
    }
    public static int NFactorial(int N) {
        if(N==1)
            return 1;
        else
            return N*NFactorial(N-1);
    }
}

    // // T.C-> O(N)   S.C-> O(N)