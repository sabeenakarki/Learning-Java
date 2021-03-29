import java.util.Scanner;
public class Q27 {

    static void myMethod() {
        int num, rem, sum = 0, pro = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = scan.nextInt();

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            pro = pro * rem;
            num = num / 10;
        }
        System.out.println("The sum of number you entered is " + sum);
        System.out.println("The product of number you entered is " + pro);
    }

    public static void main (String[] args) {
        myMethod();
    }
}
