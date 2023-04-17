package C9_For_Loop;

public class Question_10 {
    public static void main(String[] args) {


        // Question 10 (interview) - Ask the user for a String and reverse the String and save it

        String str = "Java";

        int startingIndex = str.length()-1;
        String reverseStr = "";

        for (int i = startingIndex; i >=0 ; i--) {
            reverseStr = reverseStr+str.charAt(i);

        }

        String newStr = reverseStr;

        System.out.println(reverseStr);
        System.out.println(newStr);

    }
}
