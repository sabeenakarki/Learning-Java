import java.util.Scanner;

//Write a program to relate two integers entered by the user using = =or > or < sign.
public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = scan.nextInt();
        System.out.println("Enter another number:");
        int number2 = scan.nextInt();

        if (number1 == number2) {
            System.out.println("The first and second number you entered are equal.");
        }
        else if(number1 > number2) {
            System.out.println("The first number you entered is greater than the second.");
        }
        else {
            System.out.println("The first number you entered is smaller than the second.");

            }

    }
}
