package May_28_2025;
/*✅ Leap Year Checker:
Create a program that determines whether a given year is a leap year. A leap year is divisible
by 4, but not by 100 unless it is also divisible by 400. Use an if-else statement to make this
determination.*/


import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String [] args)
    {
        LeapYearChecker ob=new LeapYearChecker();
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the year");
        int year=sc.nextInt();  // Replace with the year you want to check

        if((year%4==0 && year % 100 !=0)||(year%400==0))
            {
                System.out.println(year+"is a laep year.");
            }
            else {
                System.out.println(year+"is not a leap year");
            }
                sc.close();
    }


    }

