package exercises.org.launchcode.java.studios;

import java.util.Scanner;



public class Area {
    static Scanner rad = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the radius: ");
        double radius = rad.nextDouble();
        //Area = PIr2
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle of radius " + radius + " is: " + area);
        //System.out.println("The area of the circle: " + area);




    }

}


/* Here's an example of how your program should work:

Enter a radius: 2.5
The area of a circle of radius 2.5 is: 19.625

*/