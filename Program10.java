
//Program to calculate the compound interest.
public class Program10
{
    public static void compound(double p, double t, double r)
    {
	  //Calculate compound interest
        double ci = p * 
           ( Math.pow( (1 + (r/100.0)), t ) -  1 );

 	  //Display
        System.out.println("Pinciple : " + p);
        System.out.println("Time     : " + t);
        System.out.println("Rate of Interest : " + r);        
        System.out.println("Compound Interest is : " + ci);
    }
}       
