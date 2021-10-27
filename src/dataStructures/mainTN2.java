package dataStructures;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class mainTN2 {

    public static Queue queue = new ArrayDeque();

    public static void BFS (TN2 head){
        TN2 current;
        boolean result= false;
        queue.add(head);

        while(!queue.isEmpty()){
            current = (TN2) queue.remove();
            System.out.println(current.name);

            int size = current.children.length;


            for(int i = 0; i<size;i++){
                if(current.children[i] != null) {
                    result = queue.add(current.children[i]);
                    System.out.println((result));
                }
            }

            }

    }

    public static void main (String[] args){

        TN2 head = new TN2();
        head.name="head1";

        TN2 left1 = new TN2();
        left1.name="left1";

        TN2 right1 = new TN2();
        right1.name="right1";


        head.children[0] = left1;
        head.children[1] = right1;


        TN2 leftleft = new TN2();
        leftleft.name="leftleft";

        TN2 leftright = new TN2();
        leftright.name="leftright";

        left1.children[0] = leftleft;
        left1.children[1] = leftright;


        TN2 rightleft = new TN2();
        rightleft.name="rightleft";

        TN2 rightright = new TN2();
        rightright.name="rightright";

        right1.children[0] = rightleft;
        right1.children[1] = rightright;

        BFS(head);


    }
}
