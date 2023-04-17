package C8_String_Manipulations;

import java.util.Scanner;

public class Q2_Index_Of {
    public static void main(String[] args) {

        // Get a String from the user and the text to be searched.
        // Print whether the String contains the desired text using the indexOf( ) method.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String enteredText = scan.nextLine();
        System.out.println("Please enter desired word");
        String desiredWord = scan.nextLine();

        if (enteredText.indexOf(desiredWord) != -1) {

            System.out.println("Entered text contains desired word ");
        }





    }
}
