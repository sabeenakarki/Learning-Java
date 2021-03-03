import java.util.Scanner;

//Write a program to print the number entered by the user only if the number entered is negative.
public class Q13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        if (number < 0 ) {
            System.out.println("You entered a negative number: " + number);
        }
        else {
            System.out.println("Not negative.");
        }



    }


}
