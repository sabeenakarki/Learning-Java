import java.util.Scanner;

//Write a program that receives an ASCII code (between 0 – 128) and display its character
public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an ASCII code
        // (an integer between 0 and 127)
        System.out.print("Enter an ASCII code: ");
        int i = input.nextInt();

        // Display ASCII code as character
        System.out.println((char)i);
    }
}

