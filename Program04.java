//Program to find the area of a triangle whose 
//base and height are given.
public class Program04
{
    public static void calculate(double base, double height)
    {
        //Calculate area of triangle
        double area = (1.0/2.0) * base * height;

        //Display the area
        System.out.println("The area of triangle of base "
            + base + " and height " + height + " is = " 
            + area);           
    }
} 
