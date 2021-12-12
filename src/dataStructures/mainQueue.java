package dataStructures;


public class mainQueue {
    public static void main (String[] args){
        MyQueue<Integer> queue = new MyQueue<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);


        System.out.println(queue.remove());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        queue.add(72);
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
