package chapterThree;

import java.awt.*;
import java.util.Stack;

public class sortStack {

    public static void main (String[] args){
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        int tempS1 = 0, tempS2 = 0, counter = 0;

        s1.push(12);
        s1.push(8);
        s1.push(1);
        s1.push(5);
        s1.push(10);
        s1.push(7);
        s1.push(3);

        //inital condition, load first
        s2.push((s1.pop()));

        //create a loop to repeat

        while(!s1.isEmpty()){
            tempS1 = (int) s1.pop();
            tempS2 = (int)s2.peek();


            while(tempS1 < tempS2){
                counter++;
                s1.push((int) s2.pop());
                if(!s2.isEmpty())
                    tempS2 = (int) s2.peek();
                else
                    break;
            }

            s2.push(tempS1);

            while(counter>0){
                counter--;
                s2.push(s1.pop());
            }
        }

        while(!s2.isEmpty()){
            System.out.println((int)s2.pop());
        }








    }
}
