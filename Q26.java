import java.util.Scanner;

//Write a Program to reverse the given number. //123 => 321
public class Q26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers to be reversed: ");
        int num = scan.nextInt();
        int reversed = 0;

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of numbers you entered is : " + reversed);




    }

}
