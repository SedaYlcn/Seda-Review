package C1_Expilicit_Narrowing_And_Auto_Widening;

import java.util.Scanner;

public class sumOfNumberDigits {
    public static void main(String[] args) {

        // Take a positive 4-digit integer from the user and find the sum of the digits


        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 4 - Digit Integer");
        int number = scan.nextInt();

        int sum = 0;

        sum = sum + number % 10;
        number = number / 10;

        sum = sum + number % 10;
        number = number / 10;

        sum = sum + number % 10;
        number = number / 10;

        sum = sum + number % 10;
        number = number / 10;

        sum = sum + number % 10;

        System.out.println("Sum of Digit is : " + sum);
    }
}
