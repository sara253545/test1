/*Program to accept two integers and find the sum, difference, product, quotient and remainder of two integers.*/
public class Program17
{
    public static void calculate(int a, int b)
    {
        //Declaration
        int sum;
        int difference;
        int product;
        int quotient;
        int remainder;

        //Computation
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;
        remainder = a % b;

        //Display
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println(a + " % " + b + " = " + remainder);
    }
}
