package C02_If_Statements;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        /*
        Get a grade from the user,
        if it is 50 or more print “Passed the Class”
        if it is less than 50 print “Sorry, Failed”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Grade");
        int grade = scan.nextInt();

        if (grade>=50) {
            System.out.println("You Passed"); }

        if (grade<50) {
            System.out.println("Sorry, Failed");  }


    }
}
