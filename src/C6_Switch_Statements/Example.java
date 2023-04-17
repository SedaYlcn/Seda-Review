package C6_Switch_Statements;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        // Get a letter from user
        // if there is a day with that letter print it
        // if there is not "Invalid Letter"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Letter");
        char letter = scan.next().charAt(0);

        letter = Character.toLowerCase(letter);


        switch (letter) {

            case 'F':
                System.out.println("Friday");
                break;
            case 'M':
                System.out.println("Monday");
                break;
            case 'T':
                System.out.println("Tuesday , Thursday");
                break;
            case 'W':
                System.out.println("Wednesday");
            case 'S':
                System.out.println("Saturday , Sunday");
                break;


        }


    }
}
