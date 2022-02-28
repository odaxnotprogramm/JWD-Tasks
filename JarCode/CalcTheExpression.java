package by.epam.jwd.jarCode;

import java.util.Stack;

public class CalcTheExpression {

    public boolean checkForSpace(char symbol){
        return symbol == ' ';
    }

    public boolean isSymbolOperator(char symbol) {
        return symbol == '+' || symbol == '-' ||
                symbol == '*' || symbol == '/';
    }

    public int findPriority(char operation){
        return operation == '+' || operation == '-' ? 1:
                operation == '*' || operation == '/' ? 2 : -1;
    }

    public void processOperations(Stack<Integer> stack, char operation){
        int r = stack.peek(); stack.pop();
        int l = stack.peek(); stack.pop();
        switch(operation){
            case '+' : stack.push(l + r); break;
            case '-' : stack.push(l - r); break;
            case '*' : stack.push(l * r); break;
            case '/' : stack.push(l / r); break;
        }
    }

    public boolean isAlNum(char symbol) {
        return Character.isDigit(symbol) || Character.isLetter(symbol);
    }

    public int calTheExpression(String expr) {
        Stack<Integer> digits = new Stack<>();
        Stack<Character> operations = new Stack<>();
        for(int i = 0;i < expr.length();++i){
            if(!checkForSpace(expr.charAt(i))){
                if(expr.charAt(i) == '('){
                    operations.push('(');
                } else if(expr.charAt(i) == ')') {
                    while(operations.peek() != '('){
                        processOperations(digits, operations.peek());
                        operations.pop();
                    }
                    operations.pop();
                } else if(isSymbolOperator(expr.charAt(i))){
                    while(!operations.empty() && findPriority(operations.peek()) >= findPriority(expr.charAt(i))){
                        processOperations(digits, operations.peek());
                        operations.pop();
                    }
                    operations.push(expr.charAt(i));
                } else {
                    String operand = new String();
                    while(i < expr.length() && isAlNum(expr.charAt(i))) {
                        operand += expr.charAt(i++);
                    }
                    --i;
                    if(Character.isDigit(operand.charAt(0))){
                        digits.push(Integer.valueOf(operand));
                    }
                }
            }
        }
        while(!operations.empty()){
            processOperations(digits, operations.peek());
            operations.pop();
        }
        return digits.peek();
    }
}
