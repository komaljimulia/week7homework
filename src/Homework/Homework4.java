package Homework;

public class Homework4 {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear= false;
        if (year >= 1 && year <= 9999) {


            if (year%400==0){//this is all conditions to check the leap year
                isLeapYear = true;
            }
            else{
                if (year%4==0 && year%100 !=0){
                    isLeapYear=true;
                }

            }

        }
        return isLeapYear;

    }
    public static int getDaysInMonth(int month,int year){//method to get number of days in month
        if (month<1 || month>12){
            return -1;
        }
        if (year<1 || year>9999){
            return -1;

        }
        int noOfDays = -1;
        switch (month){//switch method for months
            case 1:
                noOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year)){
                    noOfDays=29;}
                else{
                    noOfDays=28;}
                 break;
            case 3:
                noOfDays=31;
                break;
            case 4:
                noOfDays=30;
                break;
            case 5:
                noOfDays=31;
                break;
            case 6:
                noOfDays=30;
                break;
            case 7:
                noOfDays=31;
                break;
            case 8:
                noOfDays=31;
                break;
            case 9:
                noOfDays=30;
                break;
            case 10:
                noOfDays=31;
                break;
            case 11:
                noOfDays=30;
                break;
            case 12:
                noOfDays=31;
                break;







        }
        return noOfDays;

    }

    public static void main(String[] args) {
       System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }
}