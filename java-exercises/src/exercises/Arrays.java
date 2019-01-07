package exercises;

public class Arrays {

    public static void main(String[] args) {
        // Declare and initialize an empty array of 10 Integers
        //int[] someInts = new int[10];

        // Declare and initialize an array using an array literal
        int[] someInts= {1, 1, 2, 3, 5, 8};

        // We can use a for-in loop with arrays
        for (int i : someInts) {
            System.out.println(i);
        }

        // We can loop through an array with an iterator var as well
       // for (int j : someOtherInts) {
         //   System.out.println(j);
    }

}
