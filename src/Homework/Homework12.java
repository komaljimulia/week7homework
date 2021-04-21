package Homework;
import java.util.Scanner;//import scanner
public class Homework12 {
    static char ch;
    public static void testchar(){//call method
        Scanner obj= new Scanner(System.in);//create object for scanner
        System.out.println("Enter any character");//asking user to enter any character
        ch=obj.nextLine().charAt(0);//in whole string assigning the first character to a
        if (ch>='a' && ch<='z'){//alphabat condition
            System.out.println("This is an alphabet"); }
        else if(ch >= '0' && ch <= '9') {//number condition

            System.out.println("This is number");}
        else {//special character condition

            System.out.println( " This is a SPECIAL CHARACTER.");}

    }

    public static void main(String[] args) {
        testchar();
    }
}
