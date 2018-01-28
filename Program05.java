//Program to find area of a triangle whose 3 sides are given.
public class Program05
{
    public static void calculate(double a, double b, double c)
    {
        //Calculate the semi-perimeter
        double s = (a + b + c) / 2.0;

        //Calculate area
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        //Display the area
        System.out.println("The area of triangle of sides "
            + a + ", " + b + " and " + c + " is = " + area);           
    }
}

