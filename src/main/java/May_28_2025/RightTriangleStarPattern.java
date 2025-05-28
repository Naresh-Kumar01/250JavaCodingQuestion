package May_28_2025;
/*
✅ Right Triangle Star Pattern

*
        **
        ***
        ****
        *****
*/


public class RightTriangleStarPattern {
    public static void main(String [] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }

}
