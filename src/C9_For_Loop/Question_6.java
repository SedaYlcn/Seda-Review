package C9_For_Loop;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        // Question 6- Get a number less than 20 from the user and calculate the factorial value of this number.
        // Also print the configuration of the factorial account in the console.
        // Exp: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number less than 20");
        int enteredNumber = scan.nextInt();

        int factorial = 1;

        System.out.print(enteredNumber + " != ");

        for (int i = enteredNumber; i >=1 ; i--) {
            factorial *= i;

            if (i !=1){
                System.out.print(i + " * ");

            } else System.out.print((i + " "));

        }

        System.out.print(" = " + factorial);

    }
}
