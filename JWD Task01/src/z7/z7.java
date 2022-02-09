package z7;

import java.util.Scanner;

public class z7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начало отрезка : ");
        double a = in.nextDouble();
        System.out.print("Введите конец отрезка : ");
        double b = in.nextDouble();
        System.out.print("Введите шаг : ");
        double h = in.nextDouble();
        for(double x = a; x <= b;x += h){
            System.out.println("При x = " + x + " F(x) = " + (Math.pow(Math.sin(x),2) - Math.cos(2*x)));
        }
    }
}
