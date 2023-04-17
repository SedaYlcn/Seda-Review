package C7_Ternary_Operator;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        // Get a number from the user and print its absolute value

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = scan.nextInt();


        number = number>0 ? number : number * (-1);
        System.out.println(number);

    }
}
