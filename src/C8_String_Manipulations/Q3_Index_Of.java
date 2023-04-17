package C8_String_Manipulations;

import java.util.Scanner;

public class Q3_Index_Of {
    public static void main(String[] args) {

        //  Get a String from the user and the text to be searched.
        //  Check the usage of the desired text in the String and print the appropriate one of the following sentences.
        //- String does not contain the searched text
        //- Searched text used only once in the String
        //- Searched text used more than 1 in the String

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a String");
        String enteredText = scan.nextLine();
        System.out.println("Please Enter a desired word");
        String desiredText = scan.nextLine();

        // if (!enteredText.contains(desiredText)) {

        if (enteredText.indexOf(desiredText) == (-1)) {
            System.out.println("String does not contain the desired text");
        } else {
            int strFirstIndex = enteredText.indexOf(desiredText);
            if (enteredText.indexOf(desiredText, (strFirstIndex + 1)) == (-1)) {
                System.out.println("Desired text only used 1 times in the entered text");
            } else {
                int strSecondIndex = enteredText.indexOf(desiredText, (strFirstIndex + 1));
                if (enteredText.indexOf(desiredText, (strSecondIndex + 1)) == (-1)) {
                    System.out.println("Desired text  used 2 times in the entered text");

                } else {
                    System.out.println("Desired text used more then 2 times in the entered text");
                }


            }
        }

    }
}