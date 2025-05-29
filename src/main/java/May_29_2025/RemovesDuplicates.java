package May_29_2025;

import java.util.Scanner;

public class RemovesDuplicates {
    public static String removeduplicates(String str) {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;

            }
        }
       return result;
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the message");
        String message=sc.nextLine();
        String output=removeduplicates(message);
        System.out.println(output);

    }
}
