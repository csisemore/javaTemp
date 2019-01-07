package exercises;

import java.util.Scanner;


public class HelloName {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String person;

        in = new Scanner(System.in);
        //do {

        System.out.print("Enter your name: ");

        //System.out.println("Enter your name: ");

            person = in.nextLine();
        //}


        System.out.println("hello " + person);

    }
}


