package dataStructures;

public class mainStack {
    public static void main (String [] args){
        MyStack2 testStack = new MyStack2();

        testStack.push(1);
        testStack.push(4);
        testStack.push(3);
        testStack.push(2);

        System.out.println(testStack.pop());
        System.out.println(testStack.peek());
        testStack.push(15);
        System.out.println(testStack.pop());

    }
}
