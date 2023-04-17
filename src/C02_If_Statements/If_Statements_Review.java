package C02_If_Statements;

public class If_Statements_Review {
    public static void main(String[] args) {

        /*

        each if statement will check its own condition and if the condition is true, the code in if body will be
        executed. If the statement is false, nothing will happen, the code will not print anything.

        if we can see the "Process finished with exit code 0" message at the end of the console, this means
        java, without any problem, executed all codes.
         */

        int a = 95;

        int b = 101;

        if (a>b) {
            System.out.println("a is bigger than b"); }
        if (a%2==0) {
            System.out.println("It is even number");}

        if (a%2 != 0); {
                System.out.println("It is not odd Number"); }

        /*

        We can create boolean condition before if statements and we can use it in if statements.
        if it is true, body will be executed , if it is false, body will not be executed

         */

        boolean result = a*7>b;

        if (result) {
            System.out.println("The condition is true"); }


    }
}
