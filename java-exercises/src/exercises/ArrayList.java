package exercises;


/** needs to be perfect! **/

public class ArrayList {

    public static void main(String[] args) {

        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 6, 9, 10, 14, 17, 20, 24, 42, 45, 85};
        int sum = 0;

        // Loop over the array and print each number
        for (int i = 0; i < numbers.length; i = i + 2) {
          // if (i % 2 == 0)
                sum  = sum + i;
            }
            //System.out.println(numbers);
            System.out.println(sum);
        }
    }


    /*****
     Write a static method to find the sum of all the even numbers in a list.
     Within main, create a list with at least 10 integers and call your method on the list.
     ****/

    /** The result should be 118 **/
