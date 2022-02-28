package by.epam.jwd.jar;

import java.util.Stack;

public class Main {

    public boolean checkForSpace(char symbol){
        return symbol == ' ';
    }

    public boolean isSymbolOperator(char symbol) {
        return symbol == '+' || symbol == '-' ||
                symbol == '*' || symbol == '/';
    }

    public int findPriority(char op){
        return op == '+' || op == '-' ? 1:
                op == '*' || op == '/' ? 2 : -1;
    }

    public void process_op(Stack<Integer> st, char op){
        int r = st.peek(); st.pop();
        int l = st.peek(); st.pop();
        switch(op){
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
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i < s.length();++i){
            if(!checkForSpace(s.charAt(i))){
                if(s.charAt(i) == '('){
                    op.push('(');
                } else if(s.charAt(i) == ')') {
                    while(op.peek() != '('){
                        process_op(st, op.peek());
                        op.pop();
                    }
                    op.pop();
                } else if(isSymbolOperator(s.charAt(i))){
                    while(!op.empty() && findPriority(op.peek()) >= findPriority(s.charAt(i))){
                        process_op(st, op.peek());
                        op.pop();
                    }
                    op.push(s.charAt(i));
                } else {
                    String operand = new String();
                    while(i < s.length() && isAlNum(s.charAt(i))) {
                        operand += s.charAt(i++);
                    }
                    --i;
                    if(Character.isDigit(operand.charAt(0))){
                        st.push(Integer.valueOf(operand));
                    }
                }
            }
        }
        while(!op.empty()){
            process_op(st, op.peek());
            op.pop();
        }
        return st.peek();
    }
}
