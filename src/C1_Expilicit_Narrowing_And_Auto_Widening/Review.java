package C1_Expilicit_Narrowing_And_Auto_Widening;

public class Review {
    public static void main(String[] args) {

        //AUTO WIDENING
        // Java cannot convert all data types
        // Smaller capacity to larger capacity , Java will handle it without any action


        double double1= 23;
        short short1=45;

        int number1 = short1;

        // EXPLICIT NARROWING
        // Larger capacity to smaller capacity Java will underline,
        // to handle the problem we need to force Java to convert datatype,so we need to write data type.

        short1 = (short) number1;

        char char1 = 'K';
        int number2 = 'K';

        if (number2 >'B') {
            System.out.println("K has higher value than B"); }

        System.out.println((char) ('K'+1));

        String strNumber = "123";

        System.out.println(Integer.parseInt(strNumber)+1); // 124
        System.out.println(strNumber+1); //1231

    }
}
