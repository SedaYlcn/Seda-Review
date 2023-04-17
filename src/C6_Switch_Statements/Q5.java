package C6_Switch_Statements;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number of the day");
        int dayNumber = scan.nextInt();

        switch (dayNumber) {

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Weekdays");
              break;
            case 6 :
            case 7 :
                System.out.println("Weekend");
              break;
            default:
                System.out.println("Invalid");
          
        }

    }
}
