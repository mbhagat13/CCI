package chapterThree;

public class main {

    public static void main (String [] args){
        MyQueue testing = new MyQueue();
        testing.dequeue();

        testing.enqueue(1);
        testing.enqueue(2);
        testing.enqueue(3);
        testing.enqueue(4);
        testing.enqueue(5);
        testing.enqueue(6);

        testing.dequeue();

        System.out.println(testing.dequeue());

        //System.out.println(testing.dequeue());
       //System.out.println(testing.dequeue());

        System.out.println(testing.peek());

    }
}
