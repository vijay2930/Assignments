package January.Assignment1;

import java.util.Stack;

public class MathExpression {
    public boolean isSymbol(char c){
        boolean isCheck=false;
        int symbol[]={'+','-','*','/','%'};
        for(int i=0;i<symbol.length;i++){
            if(symbol[i]==c){
                isCheck=!isCheck;
            }
        }
        return isCheck;
    }
    public boolean isValidExpression(String s){
        Stack<Character> expStack=new Stack<>();
        char[] exp=s.toCharArray();
        boolean isEmptyExpression=false;
        boolean isNextOperand=true;
        for(int i=0;i<exp.length;i++){
            char c=exp[i];
            if(c=='(' ||(Character.isAlphabetic(c) && isNextOperand)){
                expStack.push(c);
            }
            else if(isSymbol(c)){
                isEmptyExpression=true;
                isNextOperand=!isNextOperand;
            }else{
                isNextOperand=true;
                expStack.pop();
            }
        }
        return expStack.isEmpty() && isEmptyExpression;
    }
    public static void main(String[] args) {
        MathExpression me=new MathExpression();
        String exp="(a+b)(c-d)";
        if(me.isValidExpression(exp)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
