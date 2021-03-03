import java.util.Scanner;

//Write a program to calculate leap year.
public class Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scan.nextInt();

        if(year % 4 == 0) {
            System.out.println("Leap year.");
        }
        else{
            System.out.println("Not leap year.");
        }



    }

}
