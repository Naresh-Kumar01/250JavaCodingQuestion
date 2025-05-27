package May_27_2025;
/*✅ Palindrome Checker:
        Create a program that checks whether a given string is a palindrome. A palindrome
        a word or phrase that reads the same backward as forward (ignoring spaces, punctuation,
        and capitalization). Use an if-else statement to determine if the string is a palindrome.*/



import java.util.Scanner;

public class Palindrome {
    public void verifypalindrom(String name)
    {
        String s="";
        char []c=name.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            s=s+c[i];
        }
        if(s.equals(name))
        {
            System.out.println("given name is palindrom");
        }
        else {
            System.out.println("not palindrom");
        }


    }
    public static void main(String[] args) {
        Palindrome ob=new Palindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the name  ");
        String name =sc.nextLine();
        ob.verifypalindrom(name);

    }
}
