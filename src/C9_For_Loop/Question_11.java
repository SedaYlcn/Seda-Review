package C9_For_Loop;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {

        // Question 11- Ask the user for a positive integer, check if the number is prime and print the result.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a positive number");
        int number = scan.nextInt();

        int flag = 0;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                flag++;
                break;
            }

        }
        if (number == 2) {
            System.out.println("Entered Number 2 is Prime number");
        } else if (flag == 0) {
            System.out.println("Entered Number is " + number + " and it is Prime Number");
        } else {
            System.out.println("Entered Number is " + number + " and it is NOT Prime Number");
        }
    }
}