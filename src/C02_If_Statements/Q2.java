package C02_If_Statements;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        /*
        Get a letter from the user
        print it if there is a month that starts with a letter.
        NOTE: No uppercase or lowercase sensitivity.
        When the user types j or J, output is Jan.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Letter");
        char letter = scan.next().charAt(0);

        if (letter == 'J' || letter == 'j') {
            System.out.println("January, June, July");

        } else if (letter == 'F' || letter=='f') {
            System.out.println("February");

        } else if (letter == 'M' || letter== 'm') {
            System.out.println("March , May");

        } else if (letter =='A' || letter == 'a') {
            System.out.println("April , August");

        } else if (letter == 'S' || letter=='s') {
            System.out.println("September");

        } else if (letter== 'O') {
            System.out.println("October");

        } else if (letter=='N' || letter=='n') {
            System.out.println("November");

        } else if (letter=='D' || letter=='d') {
            System.out.println("December");

        } else {
            System.out.println("Invalid Month"); }


    }
}
