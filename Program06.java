//Program to find the volume and surface area of a sphere.
public class Program06
{
    public static void calculate(double radius)
    {
        //Calculate the volume
        double volume = (4.0 / 3.0) * 
                         Math.PI * Math.pow(radius,3);

	//Calculate surface area
        double surfaceArea = 4.0 * Math.PI * radius * radius;
        
        //Display the volume and surface area
        System.out.println("The volume of sphere of radius "  
            + radius + " is = "  + volume);
  
        System.out.println("The surface area of " 
            + " a sphere of radius " + radius 
            + " is = " + surfaceArea);
    }
}
