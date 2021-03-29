import javax.swing.table.TableColumn;
import java.util.Scanner;

//Write a program that prompts the user to enter the number of students and each student’s name and score.
// Finally display the student with the highest score.
public class Q25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int stuNum = scan.nextInt();
        int high = 0;


        for(int i = 1; i <= stuNum; i++) {
            System.out.print("Student name: ");
            String name = scan.next();
            System.out.print("Score       : ");
            int score = scan.nextInt();


            if(score > high) {
                System.out.println( "The highest score is " + score );
            }

        }



        }

        

}
