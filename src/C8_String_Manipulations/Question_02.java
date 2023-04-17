package C8_String_Manipulations;

public class Question_02 {
    public static void main(String[] args) {

        // Collect and print the String prices given by the user in a certain format.
        //input1: “15.30 €” , input2: “11.40 €”
        //output : 36.70 €


        String input1 = "£15.30";
        String input2 = "£11.40";

        double sum = 0;

        input1 = input1.replaceAll("\\D" , "");
        System.out.println(input1);

       input2 = input2.replaceAll("\\D" , "");
        System.out.println(input2);

       double inp1 = Double.parseDouble(input1);
       double inp2= Double.parseDouble(input2);

       sum = (inp1+inp2)/100;
       sum +=10;
        System.out.println("£" + sum);


    }



}
