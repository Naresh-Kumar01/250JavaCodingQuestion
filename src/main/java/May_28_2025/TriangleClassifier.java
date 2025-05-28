package May_28_2025;
/*✅ Triangle Classifier:

Write a program that classifies a triangle based on its side lengths. Given three input
values representing the lengths of the sides, determine if the triangle is equilateral
        (all sides are equal), isosceles (exactly two sides are equal), or scalene
        (no sides are equal). Use an if-else statement to classify the triangle.*/


public class TriangleClassifier {
    public static void main(String []args)
    {
        int side1=5;
        int side2=4;   // Replace with the lengths of your triangle's sides

        int side3=4;
        if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
            
        }
        else {
            System.out.println("Scalene triangle");
        }

    }

}
