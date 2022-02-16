package by.epam.jwd.task1;

import java.util.Scanner;

public class TaskInput {

    public int inputInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int num = scanner.nextInt();
        return num;
    }

    public double inputDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        double num = scanner.nextDouble();
        return num;
    }
}
