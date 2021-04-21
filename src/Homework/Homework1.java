package Homework;
import java.util.Scanner;//import scanner
public class Homework1 {
    public static void main(String[] args) {//main method
        Scanner obj = new Scanner(System.in);//create object for scanner
        System.out.println("Enter the value");//ask user to enter any value
        int a = obj.nextInt();//get user input
        String res = a%2==0? "Even" : "Odd";//formula for ternary operator
        System.out.println("The number is "  + res);//result


    }








}
