import java.util.*;
public class Sum_of_N_no {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        sc.close();
        int sum=NnumbersSum(n);
        System.out.println("The summation of "+n+" no.:- "+sum);
    }

    // Functional way (In most the cases we use fuctional way as we want to return something from the recursive funtion)
    public static int NnumbersSum(int N) {
        if(N==1)
            return 1;
        else
            return N+NnumbersSum(N-1);
    }
}

    // T.C-> O(N)   S.C-> O(N)

// Parameterised way

    // void NnumbersSum(int N,int sum) {
    //     if(N==0)
    //     {
    //         System.out.println(sum);
    //         return;
    //     }
    //     else
    //         NnumbersSum(N-1,sum+N);
    // }