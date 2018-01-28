
//Program to calculate the simple interest.
public class Program09
{
    public static void simple(double p, double t, double r)
    {
        //Calculate simple interest
        double si = ( p * t * r ) / 100.0;

        //Display
        System.out.println("Principle : " + p);
        System.out.println("Time      : " + t);
        System.out.println("Rate of Interest   : " + r);
        System.out.println("Simple Interest is : " + si);
    }
}    
