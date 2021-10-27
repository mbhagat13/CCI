package chapterTwo;

public class SumLists {

    public static LinkedListNode addToList(LinkedListNode n1, LinkedListNode n2) {
        LinkedListNode result = new LinkedListNode((0));
        int finalCarry = 0;
        finalCarry = addToList(n1, n2, result);

        if (finalCarry == 0 && result.next != null) {
            result = result.next;
        }

        return result;

    }


    public static int addToList(LinkedListNode n1, LinkedListNode n2, LinkedListNode r) {
        int carry = 0, additionResult = 0;
        if (n1 == null) {
            return 0;
        } else {
            LinkedListNode resultNext = new LinkedListNode(0, null, r);
            carry = addToList(n1.next, n2.next, r.next);
            additionResult = n1.data + n2.data;
            resultNext.data = (additionResult % 10) + carry;
            if (additionResult > 9) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        //assume equal length for simplicity

        LinkedListNode head1 = new LinkedListNode(6);
        LinkedListNode next1 = new LinkedListNode(1, null, head1);
        LinkedListNode next2 = new LinkedListNode(7, null, next1);

        LinkedListNode head2 = new LinkedListNode(2);
        LinkedListNode next3 = new LinkedListNode(9, null, head2);
        LinkedListNode next4 = new LinkedListNode(5, null, next3);

        LinkedListNode finalResult = addToList(head1, head2);

        finalResult.printNodes();

    }
}
