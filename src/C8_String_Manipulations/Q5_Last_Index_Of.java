package C8_String_Manipulations;

import java.util.Scanner;

public class Q5_Last_Index_Of {
    public static void main(String[] args) {

        // Get a String from the user and the text to be searched.
        // Check the usage of the desired text in the String and print the appropriate one of the following sentences
        //- String does not contain the searched text
        //- Searched text used only once in String
        //- Searched text used more than 1 only in String

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String enteredText = scan.nextLine();
        System.out.println("Please enter desired word");
        String desiredWord = scan.nextLine();

        int firstIndex = enteredText.indexOf(desiredWord);
        int lastIndex = enteredText.lastIndexOf(desiredWord);

        if (firstIndex == -1) {
            System.out.println("Entered text does not contain desired word");

        } else if (firstIndex == lastIndex) {
            System.out.println("Desired text used only 1 times in the entered text");

        } else {
            System.out.println("Desired text used more than 1 times in the entered text");

        }
    }
}
