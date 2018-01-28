//Program to convert from angle measured in degrees to radian
public class Program11
{
    public static void convert(double degrees)
    {
        //Convert degree to radians
        double radians = degrees * (Math.PI / 180);

        //Display
        System.out.println(degrees + " degree is = "
            + radians + " radians");           
    }
}
