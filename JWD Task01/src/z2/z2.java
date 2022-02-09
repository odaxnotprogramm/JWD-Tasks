package z2;

import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a : ");
        double a = in.nextDouble();
        System.out.print("Введите число b : ");
        double b = in.nextDouble();
        System.out.print("Введите число c : ");
        double c = in.nextDouble();
        System.out.println("Ответ : " + (((b + Math.sqrt(b*b + 4 * a * c)) / (2 * a)) - Math.pow(a,3) * c + Math.pow(b,-2)));
    }
}
