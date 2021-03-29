import java.util.Scanner;

//Write a program to print the table of given numbers.
public class Q22 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for the table: ");
        int num = scan.nextInt();
        for(int i=1; i <= 10; i++) {
            System.out.println(num +"*" + i + "=" + num*i );
        }
    }


}
