//Program to convert Fahrenheit to Celsius. 
//Accept temperature from the user using bluej method
public class Program07
{
    public static void convert(double f)
    {   
        //Convert fahrenheit to celsius
        double c = (f - 32.0) * (5.0/9.0); 
        
        //Display
        System.out.println(f + " degree fahrenheit is = " +
            c + " degree celcius");           
    }
}
