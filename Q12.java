import java.util.Scanner;

//Write a program to accept the roll, name, and nationality of the person and display those values in good format.
public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        String nat;
        int roll;

        System.out.println("What is your name?");
        name = scan.next();
        System.out.println("What is your roll number?");
        roll = scan.nextInt();
        System.out.println("What is your nationality?");
        nat = scan.next();
        System.out.println("Hello, " + name +"!"+ "your roll number is " + roll +"." +"Your nationality is " + nat +".");
    }


}
