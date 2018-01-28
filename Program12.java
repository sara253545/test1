//Program to convert from angle measured in radians to degrees.
public class Program12
{
    public static void convert(double radians)
    {
        //Convert radians to degrees
        double degrees = radians * ( 180.0 / Math.PI );
        
        //Display
        System.out.println(radians + " radians is = " 
            + degrees + " degrees");           
    }
}
