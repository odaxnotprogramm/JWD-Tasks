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

    public void processOperations(Stack<Integer> st, char operation){
        int r = st.peek(); st.pop();
        int l = st.peek(); st.pop();
        switch(operation){
            case '+' : st.push(l + r); break;
            case '-' : st.push(l - r); break;
            case '*' : st.push(l * r); break;
            case '/' : st.push(l / r); break;
        }
    }

    public boolean isAlNum(char ch) {
        return Character.isDigit(ch) || Character.isLetter(ch);
    }

    public int calTheExpression(String s) {
        Stack<Integer> digits = new Stack<>();
        Stack<Character> operations = new Stack<>();
        for(int i = 0;i < s.length();++i){
            if(!checkForSpace(s.charAt(i))){
                if(s.charAt(i) == '('){
                    operations.push('(');
                } else if(s.charAt(i) == ')') {
                    while(operations.peek() != '('){
                        processOperations(digits, operations.peek());
                        operations.pop();
                    }
                    operations.pop();
                } else if(isSymbolOperator(s.charAt(i))){
                    while(!operations.empty() && findPriority(operations.peek()) >= findPriority(s.charAt(i))){
                        processOperations(digits, operations.peek());
                        operations.pop();
                    }
                    operations.push(s.charAt(i));
                } else {
                    String operand = new String();
                    while(i < s.length() && isAlNum(s.charAt(i))) {
                        operand += s.charAt(i++);
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
