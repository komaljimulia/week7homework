package Homework;
import java.util.Scanner;//import scanner
public class Homework5 {
static int employeeId;//these are all variables
static String name;
static double basicSalary;
static double hra;
static double ta;
static double da;
static double pf;
static double grossSalary;
//to get information from user method
    public void getInformation(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter name:");
        name=obj.nextLine();

        System.out.println("Enter employee id:");
        employeeId= obj.nextInt();

        System.out.println("Enter basic salary:");
        basicSalary=obj.nextInt();
    }
//to calculate hra,da,ta,pf and gross salary method
    public void calculateSalary(){
        hra=basicSalary*10/100;
        da=basicSalary*8/100;
        ta=basicSalary*9/100;
        pf=basicSalary*20/100;
        grossSalary=basicSalary+hra+ta+da-pf;

    }
//calling in main method
public static void main(String[] args) {
    Homework5 hw5 = new Homework5();//create object bcoz we need to get instance variable here
    hw5.getInformation();
    hw5.calculateSalary();
    System.out.println("|______________________________| ");
    System.out.println("| Employee Id : "+employeeId);
    System.out.println("| Employee Name________________________ "+name);

    System.out.println("|______________________________| ");
    System.out.println("| Basic Salary :  "+basicSalary);
    System.out.println("| HRA 10% :  "+hra);
    System.out.println("| TA 9% :  "+ta);
    System.out.println("| DA 8% :  "+da);
    System.out.println("| PF 20% :  "+pf);
    System.out.println("|______________________________| ");
    System.out.println("| Gross Salary :  "+grossSalary);
    System.out.println("|===========================| ");

}

}
