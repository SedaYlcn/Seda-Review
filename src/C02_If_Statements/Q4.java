package C02_If_Statements;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        /* Get each length of a triangle’s 3 sides from the user
         if the triangle is equilateral, print "Equilateral Triangle".
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 3 side of triangle");
        int sideOne = scan.nextInt();
        int sideTwo = scan.nextInt();
        int sideThree = scan.nextInt();

        if (sideOne == sideTwo && sideOne==sideThree) {
            System.out.println("Equilateral Triangle"); }





    }
}
