package by.epam.jwd.task1;

import java.util.Scanner;

public class TaskInput {

    public String inputString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        return input;
    }
}
