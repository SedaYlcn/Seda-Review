package C02_If_Statements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /* Ask the user for a number, check the number and print “Number a multiple of 5” if it is
        divisible by 5.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = scan.nextInt();

        if (number%5 == 0) {
            System.out.println(number + " multiple of 5");
        } else {
            System.out.println(number + " is not multiple of 5"); }

    }
}
