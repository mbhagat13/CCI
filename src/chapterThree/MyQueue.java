package chapterThree;


import java.util.EmptyStackException;
import java.util.Stack;


public class MyQueue<T> {
    Stack<T> stackNewest, stackOldest;

    public MyQueue() {
        stackNewest = new Stack<T>();
        stackOldest = new Stack<T>();
    }


    public void enqueue ( T item){
        if(stackNewest.isEmpty()){
            loadNewest();
        }
        stackNewest.push(item);
    }

    public T dequeue (){

        if(stackOldest.isEmpty() && stackNewest.isEmpty()){
            throw new EmptyStackException();
        }else if(stackOldest.isEmpty()){
            loadOldest();
        }

        return stackOldest.pop();
    }

    public T peek (){
        if(stackOldest.isEmpty() && stackNewest.isEmpty()){
            throw new EmptyStackException();
        }else if(stackOldest.isEmpty()){
            loadOldest();
        }
        return stackOldest.peek();
    }


    public void loadOldest(){

        while(!stackNewest.isEmpty()){
            stackOldest.push(stackNewest.pop());
        }
    }

    public void loadNewest(){
        while(!stackOldest.isEmpty()){
            stackNewest.push(stackOldest.pop());
        }
    }


    }

