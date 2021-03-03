import java.util.Scanner;

//Write a program to find the area of a circle, rectangle, and triangle.
public class Q5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter c to find area of circle, t for area of triangle and r for rectangle:");
        String response = scan.next();

        if(response.toLowerCase().equals("c")){
            System.out.println("What is the radius of the circle?");
            float radius = scan.nextFloat();
            float pi = (float) 3.14;
            System.out.println("The area of sum is " + radius*radius*pi);

        }
        else if(response.toLowerCase().equals("r")){
            System.out.println("What is the length of rectangle?");
            float length = scan.nextFloat();
            System.out.println("What is the breadth of rectangle? ");
            float breadth = scan.nextFloat();
            System.out.println("The area of rectangle " + length*breadth);
        }
        else if(response.toLowerCase().equals("t")){
            System.out.println("What is the height of triangle?");
            float height = scan.nextFloat();
            System.out.println("What is the length of triangle?");
            float length = scan.nextFloat();
            System.out.println("The area of triangle is " + height*length*0.5);
        }
        else  {
            System.out.println("Not allowed.");
        }









    }
}
