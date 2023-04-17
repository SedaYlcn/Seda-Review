package C9_For_Loop;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        // Take positive numbers as starting and ending values from the user,
        // print the sum of all numbers between them, including the borders.
        // If the end value is less than the start value print a warning and end the process

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Starting Number");
        int startingNumber = scan.nextInt();
        System.out.println("Please Enter Ending Number");
        int endingNumber = scan.nextInt();

        int sumOfEnteredNumbers = 0;

            if (endingNumber < startingNumber) {
                System.out.println("Invalid Input");
            } else {

                for (int i = startingNumber; i <=endingNumber ; i++) {

                    sumOfEnteredNumbers += i;
                }

            }

        System.out.println("Sum of Entered Number is : " + sumOfEnteredNumbers);





    }
}
