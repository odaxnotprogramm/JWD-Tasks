package z6;

import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int a = in.nextInt();
        System.out.print("Введите второе число : ");
        int b = in.nextInt();
        System.out.print("Введите третье число : ");
        int c = in.nextInt();
        System.out.println("Сумма минимального и максимального равна : " + (Math.max(Math.max(a,b),c) + Math.min(Math.min(a,b),c)));
    }
}
