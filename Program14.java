
//Program to calculate the nth mersenne number.
public class Program14
{
    public static void calculate(int n)
    {
	//Calculate nth mersenne number
        long mersenne = (long)Math.pow(2, n) - 1;
        
        //Display the mersenne number
        System.out.println(n + "th mersenne number is = " 
            + mersenne);        
    }
}
