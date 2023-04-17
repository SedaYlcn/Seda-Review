package C02_If_Statements;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        /*
        Get a number from the user
        print “Number divisible by 3” if the number is divisible by 3,
        print “Number divisible by five” if it is divisible by 5.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number = scan.nextInt();

        if (number%3==0 && number%5==0) {
            System.out.println(number + " is divisible by 3 and 5");
        } else if (number%5==0) {
            System.out.println(number + " is divisible by 5"); }
        else if (number%3==0) {
            System.out.println(number + " is divisible by 3"); }
        else {
            System.out.println("Not Applicable"); }



    }
}
