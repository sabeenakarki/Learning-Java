import java.util.Scanner;

//Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds,
// converts it to kg and displays the result [1 pound is 0.454 kg].
public class Q9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pound:");
        double weight = scan.nextDouble();
        System.out.println("It is " + (weight*0.45));
    }
}
