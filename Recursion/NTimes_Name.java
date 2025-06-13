import java.util.*;

class NTimes_Name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:-");
        String str=sc.nextLine();
        System.out.println("Enter the no. of iterations:-");
        int n=sc.nextInt();
        sc.close();
        print(str,n);
    }
    public static void print(String str, int n)
    {
        if(n==1)
        {
            System.out.println(str);
        }     
        else
        {
            System.out.println(str);
            print(str,--n); //Backtracking (Going from the back)
        }
    }
}
    
