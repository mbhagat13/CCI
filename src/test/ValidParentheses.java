package test;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        int index =0;
        Stack brackets = new Stack<String>();
        char popResult;

        if(s.length() == 1){
            return false;
        }



        for(int i=0; i < s.length(); i++){

            if(brackets.isEmpty()){
                if((s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')) {
                    System.out.println("here");
                    return false;
                }
            }


            if(s.charAt(i) == '('){
                brackets.push(")");
            }else if(s.charAt(i) == '{'){
                brackets.push("}");
            }else if(s.charAt(i) == '['){
                brackets.push("]");
            }else{
                popResult = ((String)(brackets.pop())).charAt(0);
                if(popResult != s.charAt(i)){
                    return false;
                }
            }

        }
        if(brackets.isEmpty())
            return true;
        else{
            return false;
        }

    }

    public static void main (String[] args){
        System.out.println(isValid("(){}}{"));
    }


}
