package chapterTwo;


class Wrapper{
    public static int index = 0;
}
public class kthToLast {

    public static LinkedListNode kthToLastMethod2(LinkedListNode head, int k) {
        Wrapper w = new Wrapper ();
        return (kthToLastMethod2(head,k,w));
    }

    public static LinkedListNode kthToLastMethod2(LinkedListNode head, int k, Wrapper w) {
        if(head == null){
            return null;
        }
        LinkedListNode node = kthToLastMethod2(head.next, k, w);
        w.index++;
        System.out.println(w.index);

        if (k == w.index){
            System.out.println("The value is " + head.data);
            return head;
        }


        return node;
    }

        public static int kthToLastMethod(LinkedListNode head, int k){
        int counter = 0;
        if(head == null){
            return 0;
        }else{
            counter = kthToLastMethod(head.next, k) + 1;
            if (k == counter){
                System.out.println("The value is " + head.data);
            }

        }



        return counter;
    }

    public static void main (String[] args){
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode next1 = new LinkedListNode(5, null, head);
        LinkedListNode next2 = new LinkedListNode(1, null, next1);
        LinkedListNode next3 = new LinkedListNode(6, null, next2);
        LinkedListNode next4 = new LinkedListNode(1, null, next3);
        LinkedListNode next5 = new LinkedListNode(7, null, next4);
        LinkedListNode next6 = new LinkedListNode(8, null, next5);
        LinkedListNode next7 = new LinkedListNode(9, null, next6);
        LinkedListNode next8 = new LinkedListNode(7, null, next7);
        LinkedListNode result;
        int k = 2, index = 0;
        //index = kthToLastMethod(head,k);
        result = kthToLastMethod2(head,k);



        System.out.println(result.data);
        System.out.println(Wrapper.index);
    }

}
