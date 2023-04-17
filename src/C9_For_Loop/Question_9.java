package C9_For_Loop;

public class Question_9 {
    public static void main(String[] args) {

     // Ask the user for a String and print the String in reverse.

      String str = "Java is good";

      int startingNumber = str.length()-1;
      String outputStr = "";

        for (int i = startingNumber; i >= 0 ; i--) {

            outputStr = outputStr + str.charAt(i);

        }

        System.out.println(outputStr);


        }




    }

