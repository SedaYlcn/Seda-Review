package C5_Nested_If_Else_If_Statements;

import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {

        // AGE NEST
        // Get the gender and age from the user. Female, 60 years old and over, Men 65 years
        // and older can retire. Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account gender and age.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Gender");
        char gender = scan.next().charAt(0);

        System.out.println("Please Enter Your Age");
        int age = scan.nextInt();


        if ( age < 18 || age >140) {
            System.out.println("Invalid Age");
        } else if (age <60 ) {
            if (gender == 'F' || gender == 'f') {
                System.out.println("You need to work " + (60 - age) + " more years to retire");
            } else if (gender == 'M' || gender == 'm') {
                System.out.println("You need to work " + (65 - age) + " more years to retire");
            } else {
                System.out.println("Invalid Gender");
            }

        } else if (age <65 ) {
            if (gender == 'F' || gender == 'f') {
                System.out.println("You need to work " + (60 -age) + " more years to retire");
            }
            if (gender == 'M' || gender == 'm') {
                System.out.println("You need to work " + (65 - age) + "more years to retire");
            }else {

                System.out.println("Invalid Gender");
            }
        }  else {
            if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
                System.out.println("You can retire");
            } else {
                System.out.println("Invalid Gender");
            }

        }
    }
        }
