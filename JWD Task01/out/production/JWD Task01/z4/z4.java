package z4;

import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x : ");
        double x = in.nextDouble();
        System.out.print("Введите y : ");
        double y = in.nextDouble();
        if(x >= -2 && x <= 2 && y >= 0 && y <= 4) System.out.println(true);
        else{
            if(x*x/0.25 + y*y/0.25 == 1) System.out.println(false);
            else System.out.println(x >= -4 && x <= 4 && y <= 0 && y >= -4);
        }
    }
}
