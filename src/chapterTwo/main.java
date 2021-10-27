package chapterTwo;

public class main {


    public static void main (String [] args){

        Node head = new Node(5);

        head.appendToTail(10);
        head.printNodes();

        head.deleteNode(head,10);





    }
}
