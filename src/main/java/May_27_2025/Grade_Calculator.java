package May_27_2025;
/*
✅ Grade Calculator:
Write a program that calculates and displays the letter grade for a given numerical
score
        (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59*//**/


import java.util.Scanner;

public class Grade_Calculator {
    public void mark_grading(int marks)
    {
        char grade,A,B,C,D;
        if(marks>=90&&marks<=100)
        {

        }

    }
    public static void main(String [] args)
    {
        Grade_Calculator ob =new Grade_Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the student marks");
        int marks =sc.nextInt();
        ob.mark_grading(marks);

    }
}
