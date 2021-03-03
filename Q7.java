//Write a program that reads the radius and length of a cylinder and computes volume.
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the radius of cylinder?");
        float radius = scan.nextFloat();
        System.out.println("What is the height of the cylinder?");
        float height = scan.nextFloat();
        float pi = (float) 3.14;
        System.out.println("The volume of circle is " + radius * radius * pi * height);

    }
}
