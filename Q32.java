//Write a Program to accept 5 values in an array and display their sum.
import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many arrays?");
        int length = scan.nextInt();

        String[] keyInput = new String[length];
        for(int count = 0; count < length; count++){
            System.out.println("Enter the inputs: " + (count+1));
            keyInput [count] = scan.next();
        }
        scan.close();
        System.out.println("Inputs are: ");
        for(int count = 0; count < length; count++) {
            System.out.print( keyInput[count]);
        }

    }
}

