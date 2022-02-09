package z5;

import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double a = in.nextDouble();
        System.out.print("Введите второе число : ");
        double b = in.nextDouble();
        System.out.print("Введите третье число : ");
        double c = in.nextDouble();
        System.out.print("Первое число : ");
        if(a >= 0) System.out.println(a*a);
        else System.out.println(Math.pow(a,4));
        System.out.print("Второе число : ");
        if(b >= 0) System.out.println(b*b);
        else System.out.println(Math.pow(b,4));
        System.out.print("Третье число : ");
        if(c >= 0) System.out.println(c*c);
        else System.out.println(Math.pow(c,4));
    }
}
