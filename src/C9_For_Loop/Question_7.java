package C9_For_Loop;

public class Question_7 {
    public static void main(String[] args) {

        // Get a positive integer from the user and print the sum of the digits

        int number = 456;
        int sum = 0;

        for (int i = number; i > 0 ; i/=10) {

            sum += i %10;

      }

        System.out.println(sum);



    }
}
