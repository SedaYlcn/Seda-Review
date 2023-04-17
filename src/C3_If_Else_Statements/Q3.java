package C3_If_Else_Statements;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        /*
        Ask the user's age,
        if he is 65 years or older print "You can retire"
        otherwise print the number of years he has to work to retire.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = scan.nextInt();


        if (age>=65) {
            System.out.println("You can retire");

        } else {
            System.out.println((65-age) + " years left to retire");

            }


        }
}
