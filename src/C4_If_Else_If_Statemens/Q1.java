package C4_If_Else_If_Statemens;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /*
        Get the gender and age from the user.
        Female, 60 years old and over, Male 65 years and older can retire.
        Print “You can retire” or “You need to work .. more years to retire”, taking into account gender and age.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your Gender Male : M or Female: F");
        char gender = scan.next().charAt(0);

        System.out.println("What is your Age");
        int age = scan.nextInt();

        if (gender == 'F' && age >= 60 || gender == 'M' && age >=65) {
            System.out.println("You can retire");
        } else if (gender == 'F') {
            System.out.println(" You need to work " + (60 - age) + " more years to retire");
        } else if (gender == 'M') {
            System.out.println(" You need to work " + (65 - age) + " more years to retire");
        } else {
            System.out.println("Invalid Information");


    }


    }
}
