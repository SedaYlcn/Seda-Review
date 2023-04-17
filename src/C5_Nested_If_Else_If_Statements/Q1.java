package C5_Nested_If_Else_If_Statements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

         // GENDER NEST
        // Get the gender and age from the user. Female, 60 years old and over, Men 65 years
        // and older can retire. Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account gender and age.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Gender");
        char gender = scan.next().charAt(0);

        System.out.println("Please Enter Your Age");
        int age = scan.nextInt();


        if (gender == 'F' || gender == 'f') {
            if (age < 18 || age > 140) {
                System.out.println("Invalid Age");
            } else if (age < 60) {
                System.out.println("You need to work " + (60 - age) + " more years to retire");

            } else {
                System.out.println("You can retire");
            }

        } else if (gender == 'M' || gender =='m' ) {
            if (age < 18 || age >140){
                System.out.println("Invalid age");
            } else if (age < 65) {
                System.out.println("You need to work "+ (65-age) +" more years to retire");
            }else {
                System.out.println("You can retire");
            }
        } else {
            System.out.println("Invalid gender");
        }



    }
}
