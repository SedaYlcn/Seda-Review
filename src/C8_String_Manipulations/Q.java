package C8_String_Manipulations;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {

        //  Get a sentence from the user
        //- if the sentence includes home, print "home, home sweet home"
        //- if the sentence includes work, print "good to work"
        //- if it includes both print "You have home and work"
        //- if it contains neither, print "you need to work hard"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Text");
        String enteredText = scan.nextLine();;


//        if (enteredText.contains("home") && !enteredText.contains("work")) {
//            System.out.println("Home home sweet home");
//        } else if (enteredText.contains("work") && !enteredText.contains("home")) {
//            System.out.println("Good to work");
//        } else if (enteredText.contains("home") && enteredText.contains("work")) {
//            System.out.println("you have home and work");
//        } else {
//            System.out.println("you need to work hard");
//        }


        if (enteredText.indexOf("home") != -1 && enteredText.indexOf("work") == -1) {
            System.out.println("Home home sweet home");
        } else if (enteredText.indexOf("work") != -1 && enteredText.indexOf("home") == -1) {
            System.out.println("Good to work");
        } else if (enteredText.contains("home") && enteredText.contains("work")) {
            System.out.println("you have home and work");
        } else {
            System.out.println("you need to work hard");
        }


//        if (enteredText.indexOf("home") != -1) {
//            System.out.println("Home home sweet home");
//        } else if (enteredText.indexOf("work") != -1) {
//            System.out.println("Good to work");
//        } else if (enteredText.contains("home") && enteredText.contains("work")) {
//            System.out.println("you have home and work");
//        } else {
//            System.out.println("you need to work hard");
        }

    }

