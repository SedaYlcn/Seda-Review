package C7_Ternary_Operator;

public class Q3 {
    public static void main(String[] args) {

        // Ask the user for a letter, if the entered character is lowercase, print it in uppercase,
        //otherwise print the entered letter

        char letter = 'J' ;

        System.out.println(letter>= 'a' && letter <= 'z'? Character.toUpperCase(letter) : letter);

    }
}
