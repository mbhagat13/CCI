package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class test {


    public static boolean isPalindrome(int x) {
        ArrayList numbers = new ArrayList();
        if(x < 0)
            return false;

        if(x > -1 && x < 10)
            return true;

        int digit, remainder, result=x;

        while(result !=0){
            remainder = result % 10;
            result = result/10;
            numbers.add(remainder);
            System.out.println(result + " " + remainder);
        }

        for(int i = 0; i< numbers.size();i++){

            result = result + (int)numbers.get(i) * (int)Math.pow(10,(numbers.size() - 1 -i));
            System.out.println(result);


       }

        if(result == x){
            return true;
        }else{
            return false;
        }

    }

        public static void main(String [] args){
            int [] test;
            System.out.println(isPalindrome(505));

            Stack<Integer> myStack = new Stack<Integer>();
            myStack.push(1);
            myStack.push(null);
            System.out.println(myStack.peek());

            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            map.put(1,10);
            map.put(1,20);

            System.out.println(map.get(1));

        }
    }


