package Homework;
import java.util.Scanner;//import scanner

public class Homework16 {
    public static void main(String[] args){//main method

        int number;//variable number
        Scanner obj = new Scanner(System.in);//object for scanner
        System.out.print("Enter the number :");//asking user to enter the value
        number = obj.nextInt();
        obj.close();
        if(number > 0)//this is all conditions
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is Zero");
        }
    }
}

