package C6_Switch_Statements;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter One of the Letter to learn Meaning I , S, T, Q, B");
        char letter = scan.next().charAt(0);

        letter = Character.toUpperCase((letter));


        switch (letter) {

            case 'I' :
                System.out.println("International");
            break;
            case  'S' :
                System.out.println("Software");
            break;
            case 'T' :
                System.out.println("Testing");
            break;
            case 'Q' :
                System.out.println("Qualification");
            break;
            case 'B' :
                System.out.println("Board");
            break;
            default:
                System.out.println("Invalid Letter");

        }




    }
}
