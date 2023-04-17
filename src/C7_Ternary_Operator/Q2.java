package C7_Ternary_Operator;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // Ask the user for a number, check the number and print “this number is a multiple of 5”
        //if it is divisible by 5.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        System.out.println(number%5==0 ? "This number is divisible by 5" : "This number is not divisible by 5") ;


    }
}
