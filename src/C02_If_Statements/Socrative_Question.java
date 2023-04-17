package C02_If_Statements;

import java.util.Scanner;

public class Socrative_Question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter password");

        String password = scan.nextLine();

        char firstLetter = password.charAt(0);



        if(firstLetter>='A' && firstLetter<='Z') {

            if(firstLetter=='A') {

                System.out.println("Valid");

            }else {

                System.out.println("Invalid");

            }

        }else if(firstLetter>='a' && firstLetter<='z') {

            if(firstLetter=='z') {

                System.out.println("Valid");

            }else {

                System.out.println("Invalid");

            }

        }else {

            System.out.println("Incorrect entry");

        }



    }
}