package Homework;
import java.util.Locale;
import java.util.Scanner;
public class Homework8 {
    static String alphabet;//create variable
    public static void cityName(){
        Scanner obj=new Scanner(System.in);//object for scanner
        System.out.println("Enter alphabet");//asking user to enter
        alphabet=obj.nextLine();//call
        if (alphabet.toUpperCase(Locale.ROOT).equals("A"))

                System.out.println("Ahmedabad");
        else if         (alphabet.toUpperCase(Locale.ROOT).equals("B"))

        System.out.println("Bopal");


          else if (alphabet.toUpperCase(Locale.ROOT).equals("C"))
              System.out.println("Chandkheda");

           else if (alphabet.toUpperCase(Locale.ROOT).equals("D"))
                System.out.println("Dharamnagar");

            else if (alphabet.toUpperCase(Locale.ROOT).equals("E"))
                System.out.println("Ellisbridge");

           else if (alphabet.toUpperCase(Locale.ROOT).equals("F"))
                System.out.println("Fatehpur");

            else
                System.out.println("Invalid input");

        }


    //main method. here we dont need to print anything. bcoz its already printed in above method
    public static void main(String[] args) {
        cityName();

    }
}


