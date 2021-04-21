package Homework;
import java.util.Locale;//import scanner
import java.util.Scanner;
public class Homework9 {
    static String alphabet;//create variable
    public static void cityName(){
        Scanner obj=new Scanner(System.in);//object for scanner
        System.out.println("Enter alphabet");//asking user to enter
        alphabet=obj.nextLine();//call
        switch (alphabet.toUpperCase(Locale.ROOT)) {//switch method call
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bopal");
                break;
            case "C":
                System.out.println("Chandkheda");
                break;
            case "D":
                System.out.println("Dharamnagar");
                break;
            case "E":
                System.out.println("Ellisbridge");
                break;
            case "F":
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Invalid input");

        }

    }
//main method. here we dont need to print anything. bcoz its already printed in above method
    public static void main(String[] args) {
        cityName();

    }
}
