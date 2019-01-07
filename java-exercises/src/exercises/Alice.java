package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lcParagraph = paragraph.toLowerCase(); //for case insensitivity
        in = new Scanner(System.in);
        System.out.print("Enter the search term: ");
        String searchTerm = in.nextLine();
        String lcSearchTerm  = searchTerm.toLowerCase(); //for case insensitivity
        //searchTerm.toLowerCase();
        //boolean isIn = paragraph.contains(searchTerm);
        boolean isIn = lcParagraph.contains(lcSearchTerm);
        if (isIn) {
            System.out.println(searchTerm + " is in the sentence");
        }
        else {
            System.out.println(searchTerm + " is not in the sentence");
        }


    }
}

/******
 The first sentence of Alice's Adventures in Wonderland is below. Store this sentence in a string, and then prompt
 the user for a term to search for within this string. Print whether or not the search term was found.
 See if you can make the search case-insensitive, so that searching for "alice", for example, prints true.

 **********

 Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once
 or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it,
 'and what is the use of a book,' thought Alice 'without pictures or conversation?'

 ******/