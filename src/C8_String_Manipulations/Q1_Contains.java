package C8_String_Manipulations;

import java.util.Scanner;

public class Q1_Contains {
    public static void main(String[] args) {

        // get a mail from the user
        //- if the mail does not contain @, print "invalid mail"
        //- if the mail does not contain @gmail.com, "mail must be gmail"
        //- if the mail does not end with @gmail.com , print "there is a typo in the mail"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your email address");
        String email = scan.nextLine();




        if (!email.contains("@")) {
            System.out.println("Invalid Email");
        } else if (!email.contains("gmail")) {
            System.out.println("Email must be gmail");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("There is a typo in the email.");
        } else {
            System.out.println("Your email is accepted ");
        }


    }

}
