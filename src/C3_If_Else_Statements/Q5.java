package C3_If_Else_Statements;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /*Ask the user for a letter,
        if the entered character is lowercase (97-122), print it in uppercase,
         otherwise print the entered letter
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Letter");
        char letter = scan.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            System.out.println(Character.toUpperCase(letter));
        } else {
            System.out.println(letter);
        }
    }
}

