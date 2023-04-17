package C9_For_Loop;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        // Get positive numbers as starting and ending values from the user,
        // print the sum of all numbers between them, including the borders.
        // Let the program run even if the end value is smaller than the start value

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Starting Number");
        int startingNumber = scan.nextInt();
        System.out.println("Please Enter Ending Number");
        int endingNumber = scan.nextInt();

        int sumOfEnteredNumbers = 0;


        if (startingNumber < endingNumber) {

            for (int i = startingNumber; i <= endingNumber; i++) {
                sumOfEnteredNumbers += i;

            }
        } else {

            for (int i = startingNumber; i >= endingNumber ; i--) {
                sumOfEnteredNumbers += i;

            }

        }
        System.out.println("Sum of Entered Numbers : " + sumOfEnteredNumbers);


    }
}
