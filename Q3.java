//Write a program to find sum and average of two numbers input by User (using Scanner class).
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, sum;
        float avg;
        System.out.println("Enter first number:");
        a = scan.nextInt();
        System.out.println("Enter another number: ");
        b = scan.nextInt();


        sum = a + b;
        avg = (float)((a+b)/2);
        System.out.println("Sum : " + sum + "\nAverage: " + avg);
    }
}
