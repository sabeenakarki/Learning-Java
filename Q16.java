import java.util.Scanner;

//Write a program to find the given number is even or odd.
public class Q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("You entered an even number: " + number);
            }
        else {
            System.out.println("You entered an odd number: " + number);
            }


        }
    }