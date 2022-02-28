package by.epam.jwd.task2;

import java.util.Scanner;

public class TaskInput {
    
    public boolean check(String str){
        for(int i = 0;i < str.length();i++){
            if(!Character.isDigit(str.charAt(i)) &&
               !(str.charAt(i) == '+' || str.charAt(i) == '-' ||
                 str.charAt(i) == '/' || str.charAt(i) == '*' || str.charAt(i) == ' ')) {
                 return false;
            }
        }
        return true;
    }
    
    public String inputString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        while(!check(input)){
            System.out.print("Enter string that contains only (+,-,*,/) and digits : ");
            input = scanner.nextLine();
        }
        return input;
    }
}
