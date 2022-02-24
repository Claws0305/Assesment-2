package Assignment;

import java.util.Scanner;

public class Tan {
    Scanner sc= new Scanner(System.in);
    public double tan(){

        double tan=Math.toRadians(Math.cos(sc.nextInt()));
        return tan;
    }

}
