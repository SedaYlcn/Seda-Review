package C4_If_Else_If_Statemens;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // Ask for the user's weight (kg) and height (cm)
        // and calculate the body mass index (weight * 10000 / (height * height))
        // if the body mass index is greater than 30 obese,
        // between 25-30 overweight,
        // between 20-25 normal,
        // if less than 20 print thin.

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Weight in kg");
        int kg = scan.nextInt();
        System.out.println("What is your height in cm");
        int cm = scan.nextInt();

        int bmi = (kg*10000/(cm*cm));
        System.out.println(bmi);

        if (bmi>30) {
            System.out.println("Obese");
        } else if (bmi>25) {
            System.out.println("Overweight");
        } else if (bmi>20) {
            System.out.println("Normal");
        } else {
            System.out.println("Thin");

    }

    }
}
