package by.epam.jwd.task1;

import java.util.Scanner;

public class TaskInput {
    public int inputInt(String s){
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        int num = scanner.nextInt();
        return num;
    }

    public double inputDouble(String s){
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        double num = scanner.nextDouble();
        return num;
    }
}
