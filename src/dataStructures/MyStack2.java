package dataStructures;

import java.util.EmptyStackException;

public class MyStack2 {
    private MyStackNode2 top;

    //no constructor needed

    public int pop(){
        if (top == null)
            throw new EmptyStackException();

        MyStackNode2 temp = top;
        top = top.next;
        return temp.data;
    }

    public void push(int data){
        MyStackNode2 temp = new MyStackNode2(data);
        temp.next = top;
        top = temp;
    }

    public int peek(){
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }


}
