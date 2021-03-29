import java.util.Scanner;

//Write a program to display the largest number from given three values.
public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter another number:");
        int num2 = scan.nextInt();
        System.out.println("Enter last number:");
        int num3 = scan.nextInt();

        if(num1 > num2 && num2 > num3) {
            System.out.println("Largest number is: " + num1);
        }
        else if(num2>num3 ){
            System.out.println("Largest number is: " + num2);
        }
        else{
            System.out.println("Largest number is: " + num3);
        }

    }

}
