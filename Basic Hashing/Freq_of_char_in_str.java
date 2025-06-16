import java.util.*;
public class Freq_of_char_in_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:-");
        String str=sc.nextLine();
        System.out.println("Enter a character:-");
        char ch=sc.next().charAt(0);
        sc.close();

        // Character Hashing

        int hash[]=new int[26]; // As I know the inputs will be in small letters.  // If you don't aware od the inputs the use int hash[]=new int[256]; as we have 256 characters.

        for(int i=0;i<str.length();i++)
        {
            hash[str.charAt(i)-'a']+=1;
        }
        System.out.println("The frequency of "+ch+" is "+hash[ch-'a']);   
    }
}

// In character hashing, we don't need to think much about the size fo the array as we only have 256 characters and array can sort 256 characters in it.