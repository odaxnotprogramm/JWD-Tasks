package by.epam.jwd.task2;

public class Main {

    public static void main(String[] args) {
        TaskInput in = new TaskInput();
        CalcTheExpression logic = new CalcTheExpression();
        TaskView view = new TaskView();

        String expression = new String();
        expression = in.inputString("Enter the expression : ");
        view.outputInt(logic.calTheExpression(expression));
    }
}
