package Assignment;

import java.util.Scanner;
import java.util.*;
public class Calci {
    int x;
    int y;
    static int z = 0;
    char operator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st : ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd :");
        int y = sc.nextInt();
        System.out.println("what operator");
        char operator = sc.next().charAt(0);
     //   System.out.println("select for tir fun");
       // String operator1 = sc.next();
        Add a = new Add();
        Sub s = new Sub();
        Multi m = new Multi();
        Divi d= new Divi();
        Tan t=new Tan();
        Cos c=new Cos();
        Cot c1=new Cot();
        Sin s1=new Sin();

        switch (operator)
        {

            case '+':
                System.out.println("Addition = " + a.add(x ,y));
                break;
            case '-':

                System.out.println("Subraction = " + s.sub(x,y));
                break;
            case '*':

                System.out.println("Multi = " + m.multi(x , y));
                break;
            case '/':

                System.out.println("Division = " + d.divi(x , y));
                break;
            case 'a' :
                System.out.println("sin value ="+s1.sin());
                break;
            case 'b' :
                System.out.println("sin value ="+t.tan());
                break;
            case 'c' :
                System.out.println("sin value ="+c.cos());
                break;
            case 'd' :
                System.out.println("sin value ="+c1.cot());
                break;

            default:
                System.out.println("nothing is selected");

        }
    }
}