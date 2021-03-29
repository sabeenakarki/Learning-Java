import java.util.Scanner;

//calculator
public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int[] opt = {1, 2, 3, 4};
        System.out.println("Press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for divide.");
        int selection = scan.nextInt();

       if(selection == 1 || selection == 2 || selection == 3 || selection == 4){
            System.out.println("Enter two numbers:");
            float X = scan.nextFloat();
            float Y = scan.nextFloat();
            if(selection == 1 ) {
                System.out.println(X + Y);
            }
            else if(selection == 2 ) {
                System.out.println(X - Y);
            }
            else if(selection == 3 ) {
                System.out.println(X * Y);
            }
            else {
                System.out.println(X/Y);
            }

        }
       else{
           System.out.println("Not allowed.");
       }


    }
}

