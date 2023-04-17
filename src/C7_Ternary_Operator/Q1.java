package C7_Ternary_Operator;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

// Get 3 side lengths of triangle from the user, print “Equilateral triangle” if the triangle is
        //equilateral, otherwise print “Not equilateral”.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 3 sides of Triangle");

        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();


        System.out.println(side1==side2 && side1==side3 && side1>0 ?
                "Equilateral Triangle" : "Not Equilateral Triangle");




    }
}
