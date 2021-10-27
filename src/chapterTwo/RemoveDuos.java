package chapterTwo;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuos {

    public static void removeDuos(LinkedListNode l){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while(l != null){
            if(set.contains(l.data)){
             previous.next = l.next;
            }else {
                set.add(l.data);
                previous = l;
            }
            l = l.next;
        }
    }

    public static void removeDuos2(LinkedListNode l) {

        LinkedListNode runner;

        while(l != null){
            runner = l.next;

            while(runner != null) {

                if (runner.data == l.data) {
                    runner.prev.next = runner.next;
                    if(runner.next!= null){
                        runner.next.prev = runner.prev;
                    }
                }
            runner = runner.next;
            }
            l = l.next;

        }



    }


        public static void main (String [] args){
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode next1 = new LinkedListNode(5, null, head);
        LinkedListNode next2 = new LinkedListNode(1, null, next1);
        LinkedListNode next3 = new LinkedListNode(6, null, next2);
        LinkedListNode next4 = new LinkedListNode(1, null, next3);
        LinkedListNode next5 = new LinkedListNode(7, null, next4);
        LinkedListNode next6 = new LinkedListNode(8, null, next5);
        LinkedListNode next7 = new LinkedListNode(9, null, next6);
        LinkedListNode next8 = new LinkedListNode(7, null, next7);


        //removeDuos(head);
        removeDuos2(head);

        //System.out.println(head.data);
        //System.out.println(head.next.data);
        //System.out.println(head.next.next.data);

        head.printNodes();

    }


}
