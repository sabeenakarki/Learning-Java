//Write a program to find the perimeter of a circle, triangle, and rectangle.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter c to find perimeter of circle, t for  triangle and r for rectangle:");
        String response = scan.next();

        if (response.toLowerCase().equals("c")) {
            System.out.println("What is the radius of the circle?");
            float radius = scan.nextFloat();
            float pi = (float) 3.14;
            System.out.println("The perimeter of circle is " + radius * 2 * pi);
        }
        else if (response.toLowerCase().equals("r")) {
            System.out.println("What is the length of rectangle?");
            float length = scan.nextFloat();
            System.out.println("What is the breadth of rectangle? ");
            float breadth = scan.nextFloat();
            System.out.println("The perimeter of rectangle " + (2 * length + 2 * breadth));
        }
        else if (response.toLowerCase().equals("t")) {
            System.out.println("What is the length of base  of triangle?");
            float bLength = scan.nextFloat();
            System.out.println("What is the length of right side of triangle?");
            float rLength = scan.nextFloat();
            System.out.println("What is the length of left side of triangle?");
            float lLength = scan.nextFloat();
            System.out.println("The area of triangle is " + (bLength+rLength+lLength));
        }
        else {
            System.out.println("Not allowed.");
        }


    }
}