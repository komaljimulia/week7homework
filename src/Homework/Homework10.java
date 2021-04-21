package Homework;
import java.util.Scanner;//import scanner
public class Homework10 {
    static double a;//declare variables
    static double b;
    static String symbol;
    static double res;
    public static void calculate(){
        Scanner obj=new Scanner(System.in);//object for scanner
        System.out.println("Enter Symbol");//asking user to enter symbol
        symbol=obj.nextLine();//printing in our system
        System.out.println("Enter number1");//asking user to enter number1
        a=obj.nextDouble();//printing in our system
        System.out.println("Enter number2");//asking user to enter number2
        b=obj.nextDouble();
        if (symbol.equals("+")) {//if condition for add
            res=a+b;
            System.out.println("The result is:" + res);


        }
        else if (symbol.equals("-")){//else condition for -
            res =a-b;
            System.out.println("The result is:"+res);
        }
        else if (symbol.equals("*")){//for *
            res =a*b;
            System.out.println("The result is:"+res);
        }
        else if (symbol.equals("/")){//or divide
            res=a/b;
            System.out.println("The result is: "+res);
        }
    }

    public static void main(String[] args) {//main method
        calculate();//bcoz we only need calculate any +,-,* or /

    }

    }

