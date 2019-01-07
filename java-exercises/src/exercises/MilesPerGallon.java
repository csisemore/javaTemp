package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the miles driven: ");
        double miles = in.nextDouble();
        System.out.print("Enter the petrol consumed: ");
        double petrol = in.nextDouble();


        System.out.println("The MPG is: " + miles/petrol);



    }
}

/*********
 * Write a program that asks a user for the number of miles they have driven and
 * the amount of gas they've consumed (in gallons), and print their miles-per-gallon.
 *********/

/***
 Scanner in = new Scanner(System.in);

 in = new Scanner(System.in);
 System.out.println("Enter the width: ");
 double width = in.nextDouble();
 System.out.println("Enter the height: ");
 double height = in.nextDouble();

 System.out.println("The area of the rectangle is: " + width * height);
 }
 }
**/