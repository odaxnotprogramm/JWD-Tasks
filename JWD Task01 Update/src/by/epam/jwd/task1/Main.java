package by.epam.jwd.task1;

public class Main {

    public static void main(String[] args) {
        TaskInput in = new TaskInput();
        TaskLogic logic = new TaskLogic();
        TaskView view = new TaskView();

        //Task 1
        int num = in.inputInt("Enter the number : ");
        view.outputBooleanToConsole(logic.task1(num));

        //Task2
        double num1 = in.inputDouble("Enter the first number : ");
        double num2 = in.inputDouble("Enter the second number : ");
        double num3 = in.inputDouble("Enter the third number : ");
        view.outputDoubleToConsole(logic.task2(num1,num2,num3));

        //Task 3
        double a = in.inputDouble("Enter the first leg : ");
        double b = in.inputDouble("Enter the second leg : ");
        view.outputDoubleToConsole(logic.calcPerimeter(a,b));
        view.outputDoubleToConsole(logic.calcSquare(a,b));

        //Task 4
        double x = in.inputDouble("Enter x : ");
        double y = in.inputDouble("Enter y : ");
        view.outputBooleanToConsole(logic.isPointInRightPlace(x,y));
    }
}
