package Homework;
import java.util.Scanner;
public class Homework6 {
    public static String oddEven(int a){
        String res = a%2==0? "Even" : "Odd";//formula for ternary operator
        return res;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//create object for scanner
        System.out.println("Enter the value");//ask user to enter any value
        int a = obj.nextInt();//get user input
        System.out.println("The number is "+oddEven(a));
    }
}
