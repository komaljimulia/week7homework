package Homework;
import java.util.Scanner;//import scanner
public class Homework7 {
static int salesId;//create variables for the method
static String name;
static double salesAmount;
static int basicSalary;
static double commission;
    public static void salesDetail() {
        Scanner obj = new Scanner(System.in);//create object
        System.out.println("Enter sales name");
        name = obj.nextLine();
        System.out.println("Enter sales id");//asking user to enter all the information
        salesId = obj.nextInt();

        System.out.println("Enter sales amount");
        salesAmount = obj.nextInt();
        System.out.println("Enter basic salary");
        basicSalary = obj.nextInt();
    }

//to calculate commission
    public static void calculateComm(){
        if (salesAmount>=50000)
         commission=basicSalary*35/100.0;
        else if (salesAmount>=30000)
            commission=basicSalary*20/100.0;
        else if (salesAmount>=20000)
            commission=basicSalary*10/100.0;
        else if (salesAmount>=10000)
            commission=basicSalary*5/100.0;
        else if (salesAmount<10000)
            commission=basicSalary*2/100.0;
    }

    public static void main(String[] args) {
        salesDetail();;
        calculateComm();
        System.out.println("Commission is:" +commission );
    }
}
