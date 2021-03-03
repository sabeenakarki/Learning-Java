import java.util.Scanner;

public class Q10 {
    public static float main(String[] args){
        Scanner scan = new Scanner(System.in);
        //double d = u*t + 0.5*a*t*t
        float a = 0;
        float u = 0;
        float t = 0;

        //public float distance(float u,float a,float t){
            float d = (float) (u*t + 1/2*a*t*t);
            return d;
        }

    }

