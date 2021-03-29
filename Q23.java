import java.util.Scanner;

//Write a Program to sum 1 to nth natural numbers.
public class Q23 {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number for sum: ");
        int num = scan.nextInt();
        //int sum1 = num +1;
        int sum = (num*(num+1))/2;

            System.out.println("Sum of fist " + num + " numbers = " + sum);

    }



}
