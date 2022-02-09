package z3;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну первого катета = ");
        double a = in.nextDouble();
        System.out.print("Введите длинну второго катета = ");
        double b = in.nextDouble();
        System.out.println("Периметр = " + (a + b + Math.sqrt(a*a+b*b)));
        System.out.println("Площадь = " + (a * b / 2.));
    }
}
