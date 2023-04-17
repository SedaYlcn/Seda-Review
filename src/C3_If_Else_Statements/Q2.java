package C3_If_Else_Statements;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

      /*
      Get a note from the user,
      if it is 50 or more print "Pass the Class"
      if it is less than 50  "Sorry, failed"
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Grade");
        int grade = scan.nextInt();

        if (grade >=50) {
            System.out.println("Passed");

        } else {
            System.out.println("Failed");
        }
    }
}
