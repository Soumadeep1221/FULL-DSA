import java.util.*;

public class NTimes_No {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        sc.close();
        System.out.println("The no.s linearly upto "+n+" are:-");
        print(1,n);
    }
    public static void print(int no,int n)
    {
        if(no>n)
            return; //If you are using the RETURN in recursive fn then you may avoid using ELSE as after the base case meets the remaining lines will get terminated.
        else
        {
            System.out.print(no+" ");
            print(++no,n);
        }
    }
}


//Backtracking

// public static void print(int n)
//     {
//         if(n<1)
//             return; 
//         else
//         {
//             print(n-1); // Will give you 1 2 3 4 5 but if you use --n instead of n-1 you will get 0 1 2 3 4 as --n means n=n-1 which updates the n before printing.
//             System.out.print(n+" ");
            
//         }
//     }