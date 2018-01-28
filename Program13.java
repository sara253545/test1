
//Program to calculate the nth repunit
public class Program13
{
    public static void calculate(int n)
    {   
        //Calculate nth repunit
        long repunit = ( (long) Math.pow(10, n) - 1 ) / 9;
        
        //Display the repunit
        System.out.println(n + "th repunit is = " + repunit);        
    }
}
