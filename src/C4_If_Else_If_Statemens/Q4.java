package C4_If_Else_If_Statemens;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Get the distance from the user in kilometers and ask the unit he wants to convert to,
        // if the unit he wants is meters or centimeters, convert and print it,
        // otherwise print "the unit you want is not registered to the system".

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the distance in KM");
        int km = scan.nextInt();

        System.out.println("Which Unit you want to covert Meter or Centimeters");
        char requiredUnit =scan.next().charAt(0);

        double unitM = (km * 1000);
        double unitC = (km * 100000);

        if (requiredUnit == 'M'|| requiredUnit == 'm' ) {
            System.out.println(km + " KM " + " is : " + unitM + " M");

        } else if (requiredUnit == 'C' || requiredUnit == 'c') {
            System.out.println(km + " km " + "is : " + unitC + " CM") ;

        } else {
            System.out.println("The unit you want is not registered to the system");

        }
    }
}
