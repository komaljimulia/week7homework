package Homework;

public class Homework18 {
    public static void main(String[] args) {//main method
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//array for numbers
        int sum = 0;//starts from 0

        for (int i : numbers)
            sum += i;//to do sum in array
        System.out.println("The sum is " + sum);//get result
    }
}
