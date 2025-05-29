package May_29_2025;

import java.util.Scanner;

public class PalindromeofString {
    public static void main(String[] args)
    {
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the message ");
        String message=sc.nextLine();
        char []c=message.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            str=str+c[i];

        }
        if(str.equals(message))
        {
            System.out.println("given name is palindrome ");
        }
        else
        {
            System.out.println("given name is not a palindrome");
        }
       // System.out.println(str);
        sc.close();
    }

}
