package May_27_2025;

import java.util.Scanner;

public class TablePrint {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
       int num=sc.nextInt();
       int i;
       for ( i=0;i<=10;i++)
       {
           System.out.println(i*num);
       }
    }
}
