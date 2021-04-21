package Homework;

public class Homework19 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = 0;
        int sum = 0;
        for (int i : numbers)//to get sum of the array elements
            sum += i;
        System.out.println("The sum is " + sum);
        average=sum/10;//to get average of the array elements
        System.out.println("The average is" +average);

    }
}