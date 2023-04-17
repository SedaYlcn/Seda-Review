package C3_If_Else_Statements;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /*
        Get the 3-sided length of a triangle from the user,
        print “Equilateral triangle” if the triangle is equilateral,
        otherwise print “Not equilateral”.
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter 3 sides of Triangle");
        int side1 = scan.nextInt();
        int side2= scan.nextInt();
        int side3= scan.nextInt();

        if (side1==side2 && side1==side3 ) {
            System.out.println("Equilateral Triangle");

        } else {
            System.out.println("Not Equilateral");

        }


    }
}
