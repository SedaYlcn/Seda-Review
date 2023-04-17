package C8_String_Manipulations;

public class Question_03 {
    public static void main(String[] args) {

        // Write a program that deletes unwanted numbers and special characters in the text
        // converts only the first letter to uppercase and the other letters to lowercase.
        //input : java1 ni2@nce3 #to +le=arn+
        //output : Nice to learn Java

        String givenText = "java1 ni2@ce3 #to +le=arn+";

        String correctedText = givenText.replaceAll(" " , "9");
        System.out.println(correctedText);
        String correctedText1 = correctedText.replaceAll("\\W" , "");
        System.out.println(correctedText1);



    }
}
