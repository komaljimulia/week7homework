package Homework;
import java.util.Scanner;//import scanner
public class Homework2 {
    public static void main(String args[]){//main method
        Scanner obj= new Scanner(System.in);//object for scanner
        System.out.println("Enter the year");//ask user to enter the year
        int year = obj.nextInt();//call
        boolean isleapyear= false;

        if (year%400==0){//this is all conditions to check the leap year
            isleapyear = true;
        }
        else{
            if (year%4==0 && year%100 !=0){
                isleapyear=true;
            }

        }

        System.out.println("Leap year :"+isleapyear);//print the statement


    }
}
