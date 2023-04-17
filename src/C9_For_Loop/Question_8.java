package C9_For_Loop;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {

        // Question 8 (interview)- Get a positive number from user, print all integers starting from 1,
        //- If the number is divisible by 3, print fizz instead of number
        //- If the number is divisible by 5, print buzz instead of number0;
        //- if the number is divisible by both 3 and 5, print fizzBuzz instead of number

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int enteredNumber = scan.nextInt();

        for (int i = 1; i < enteredNumber; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
             else if (i % 3 == 0)
                System.out.println("Fizz");
             else if (i % 5 == 0)
                System.out.println("Buzz");
             else
            System.out.println(i);

        }
    }
}

