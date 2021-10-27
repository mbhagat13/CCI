package chapterTwo;

public class Node {
    Node next = null;
    int data;


    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void printNodes() {
        Node n = this;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }

    }

    Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }
        while (n != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                System.out.println("Node deleted");
                return head;
            }

        }

        return head;

    }

}
