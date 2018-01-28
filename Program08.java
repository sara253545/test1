//Program to convert Celsius to Fahrenheit
public class Program08
{
    public static void convert(double c)
    {        
        //Convert celsius to fahrenheit
        double f = (c * (9.0/5.0)) + 32.0;
        
        //Display
        System.out.println(c + " degree celsius is = " 
            + f + " degree fahrenheit");           
    }
}
