//Program to find the roots of a quadratic equation
public class Program16
{
    public static void calc(double a, double b, double c)
    {
        //Calculate the roots of quadratic equation
        double x1 = ( -b + Math.sqrt(b*b - 4*a*c) ) / (2*a);
        double x2 = ( -b - Math.sqrt(b*b - 4*a*c) ) / (2*a);
        
        //Display
        System.out.println("The roots of quadratic equation "       
            + a + " x^2 + "  + b + "x + " + c + " are : " );

        System.out.println("Root 1 : " + x1);
        System.out.println("Root 2 : " + x2);
    }
}       