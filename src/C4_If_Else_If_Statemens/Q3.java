package C4_If_Else_If_Statemens;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        //Get the number of products purchased from the user and the list price, and ask the
        //user if they have a customer card. If the customer has a card and buys more than 10 items,
        //20% off, otherwise 15% off.
        //If the customer does not have a card, 15% off if he buys more than 10 products, 10% off if he does not

        Scanner scan = new Scanner (System.in);
        System.out.println("Please Enter Number of Product");
        int product = scan.nextInt();

        System.out.println("Please Enter List Price");
        int listPrice = scan.nextInt();

        System.out.println("Do you have Customer Card: Yes : 1 No : 0");
        int card = scan.nextInt();

        int product1 = listPrice*product*70/100;

        if (card == 1 && product >=10) {
            System.out.println("%20 discount with customer card : " + listPrice * product * 80 / 100);

        } else if (card == 0 & product >=10) {
            System.out.println("%15 discount : " + listPrice*product*75/100);

        } else if (card == 0)

        { System.out.println(" Without card : " + product1 );

        } else if (card == 0 && product >=20) {
            System.out.println("%15 Discount : " + product*listPrice*75/100);

        }


    }
}
