package C6_Switch_Statements;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {


        // Get the month number from the user and print the season.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int monthNumber = scan.nextInt();

        switch (monthNumber) {

            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Month");


        }


    }
}
