import java.util.*;

public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term to get the fibonacci series.:-");
        int n=sc.nextInt();
        sc.close();
        System.out.println("The "+n+"th term of the fibonacci series is "+fibo(n));
    }
    public static int fibo(int n)
    {
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
