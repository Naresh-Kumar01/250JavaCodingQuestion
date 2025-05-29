package May_29_2025;

import java.util.Scanner;

public class CountvowelsandconsonantsinaString {
  static  int vow,con;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the message");
        String message=sc.nextLine();
        char []c=message.toCharArray();
        for (int i=0;i<=c.length-1;i++)
        {
            if(c[i]=='a'|c[i]=='e'|c[i]=='i'|c[i]=='o'|c[i]=='u')
            {
                vow++;
            }
            else {
                con++;
            }
        }
        System.out.println("total number of vowel character"+vow);
        System.out.println("total number of consonant character"+con);
    }
}
