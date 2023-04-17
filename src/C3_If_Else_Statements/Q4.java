package C3_If_Else_Statements;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        /*
        Ask the user to enter a character,
        print whether the entered character is uppercase or not.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Letter");
        char letter = scan.next().charAt(0);

        if (letter >= 65 && letter <=90) { // used ASCII table here
            System.out.println("Yes, it is a capital letter");

        } else {
            System.out.println("It is not a capital letter");}

    }
}
