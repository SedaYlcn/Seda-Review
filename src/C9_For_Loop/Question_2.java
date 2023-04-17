package C9_For_Loop;

public class Question_2 {
    public static void main(String[] args) {

      // Take a positive integer from the user,
      // print numbers divisible by 7 from 1 to the entered number (including the entered number).

        int number = 150;

        for (int i = 1; i <= number ; i++) {

            if (i%7 == 0) {

                System.out.print(i + " ");
            }

        }

    }
}
