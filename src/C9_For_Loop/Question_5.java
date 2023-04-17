package C9_For_Loop;

public class Question_5 {
    public static void main(String[] args) {

    // Take a number less than 20 from the user and calculate the factorial value of this number.

        int number = 5;

        int factorial = 1;

        for (int i = number; i >=1 ; i--) {

            factorial *= i;

        }

         System.out.println(number + " != " + factorial); // loop icinde yazdirinca adim adim yazdirir
    }
}
