package C7_Ternary_Operator;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Get two numbers from the user and print the smaller number

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number1 = scan.nextInt();
        System.out.println("Please Enter Number");
        int number2 = scan.nextInt();

        System.out.println(number1 > number2 ? number2 : number1);

    }
}
