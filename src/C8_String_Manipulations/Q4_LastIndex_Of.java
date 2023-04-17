package C8_String_Manipulations;

import java.util.Scanner;

public class Q4_LastIndex_Of {
    public static void main(String[] args) {

        // Get a String from the user and the text to be searched.
        // Print whether the String contains the desired text using the lastIndexOf( ) method.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String enteredText = scan.nextLine();
        System.out.println("Please enter desired word");
        String desiredWord = scan.nextLine();

        if (enteredText.lastIndexOf(desiredWord) != -1) {
            System.out.println("Entered Text contains desired word");

            } else {
                System.out.println("Entered text does not contain desired word"); }

    }
}
