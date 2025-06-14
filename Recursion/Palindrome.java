import java.util.*;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:-");
        String str=sc.nextLine();
        sc.close();
        if(palindromeCheck(str,0))
            System.out.println(str+" is a palindrome.");
        else
            System.out.println(str+" is not a palindrome.");
    }

    // 1) If I use one extra array to store the reversed array inside the recursive function --> Here the T.C = O(N) but the S.C wil be more in this case as I am using an extra array to reverse.


    public static boolean palindromeCheck(String s,int i) // 2) Here the T.C = O(N/2)= O(N) (Because in Big-O-Notation we generally ignore the constant factors) but the S.C wil be less in this case as I am not using an extra array to reverse. i.e S.C -> O(N)
    {
        int size=s.length();
        s=s.toLowerCase();
        if(i>=size/2)
            return true;
        if(s.charAt(i)!=s.charAt(size-1-i))
            return false;
        return palindromeCheck(s, ++i);
    }
}


// public static boolean palindromeCheck(String s) // 3) Here only the string is passed. T.C = O(N/2)= O(N) =S.C
    // {
    //     s=s.toLowerCase();
    //     if(s.length()<=1)
    //         return true;
    //     if(s.charAt(0)!=s.charAt(s.length()-1))
    //         return false;
    //     return palindromeCheck(s.substring(1,s.length()-1));
    // }