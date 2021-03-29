import java.util.Scanner;

//Write a program to print the factorial number of given numbers.
public class Q24 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int num = scan.nextInt();
        int i;
        int fact = 1;
        for(i=1; i<=num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is: " + fact);
    }
}


