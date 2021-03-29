import java.util.Scanner;

//Write a Program to accept three sides of a triangle and display which kind of triangle is formed.
public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side X:");
        int X = scan.nextInt();
        System.out.println("Enter side Y:");
        int Y = scan.nextInt();
        System.out.println("Enter side Z:");
        int Z = scan.nextInt();

        if(X==Y && Y==Z) {
            System.out.println("This is equilateral triangle. ");
        }
        else if(X==Y || Y==Z ){
            System.out.println("This is isosceles triangle. ");
        }
        else{
            System.out.println("This is scalene triangle. ");
        }

    }

}
