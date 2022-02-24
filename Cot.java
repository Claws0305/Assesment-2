package Assignment;

import java.util.Scanner;

public class Cot {

                Scanner sc= new Scanner(System.in);
                public double cot(){

                        double cot=Math.toRadians(Math.cos(sc.nextDouble()))/Math.cos(sc.nextDouble());
                        return cot;
                }

        }


