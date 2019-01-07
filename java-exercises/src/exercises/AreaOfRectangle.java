package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        //double height;
        Scanner in = new Scanner(System.in);

        in = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = in.nextDouble();
        System.out.println("Enter the height: ");
        double height = in.nextDouble();

        System.out.println("The area of the rectangle is: " + width * height);
    }
}


/**

public class HelloName {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String person;

        in = new Scanner(System.in);
        //do {
        System.out.println("Enter your name: ");
            person = in.nextLine();
        //}


        System.out.println("hello " + person);

    }
}

 **/