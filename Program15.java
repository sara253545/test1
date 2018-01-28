//Program to swap two variables.
public class Program15
{
    public static void swap(int a, int b)
    {
	//Display before swapping
        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

 	//Swap
        int temp = a;
        a = b;
        b = temp;
        
        //Display after swapping
        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);        
    }
}       
