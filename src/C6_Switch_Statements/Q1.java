package C6_Switch_Statements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {


         // Get a number from the user and print the number in writing.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number from 1 to 5");
        int number = scan.nextInt();


        switch (number) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid Number");

        }

    }


    }







