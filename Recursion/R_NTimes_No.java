import java.util.*;

public class R_NTimes_No {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        sc.close();
        System.out.println("The no.s linearly upto "+n+" are:-");
        print(n);
    }
    public static void print(int n)
    {
        if(n==1)
            System.out.println(1);
        else
        {
            System.out.print(n+" ");
            print(--n);
        }
    }
    
}


//Backtracking (Backtracking doesn't mean that it will always be decrement)

// public static void print(int no,int n)
//     {
//         if(no>n)
//             return;
//         else
//         {
//             print(no+1,n);
//             System.out.print(no+" ");
//         }
//     }