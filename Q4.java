import java.util.Scanner;

//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P, T ;
        float R, multi, simpleInterest ;
        System.out.println("Enter the principle amount P:");
        P = input.nextInt();
        System.out.println("Enter the time T in years: ");
        T = input.nextInt();
        System.out.println("Enter the rate R :");
        R = input.nextFloat();

        multi = P * T * R;
        simpleInterest = multi / 100;
        System.out.println("Simple interest is " + simpleInterest );




    }
}
