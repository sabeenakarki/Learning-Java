import java.util.Scanner;

//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Q8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter c to convert Fahrenheit to Celsius or f to convert Celsius to Fahrenheit:");
        String response = scan.next();

        if (response.toLowerCase().equals("c")) {
            System.out.println("What is the temperature in fahrenheit?");
            int temp = scan.nextInt();
            System.out.println(temp + " degree in fahrenheit is " + ((temp - 32) * 0.556) + " in celsius.");
        }
        else if (response.toLowerCase().equals("f")) {
            System.out.println("What is the temperature in celsius?");
            float temp = scan.nextFloat();
            System.out.println(temp + " degree in celsius is " + ((temp*0.556) + 32) + " in fahrenheit.");
        }
        else {
            System.out.println("Not allowed.");
        }
    }

}
