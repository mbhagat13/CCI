package dataStructures;


import com.sun.source.tree.Tree;

import java.util.*;

public class mainTree {

    public static Stack stack = new Stack();
    public static Queue queue = new ArrayDeque();

    public static void DFS(TreeNode head) {
        head.visited = true;
        TreeNode current;
        stack.push(head);
        while (!stack.isEmpty()) {
            current = (TreeNode) stack.pop();
            System.out.println(current.name);

            int size = current.children.length;

            for(int i = size-1; i>=0;i--){
                if(current.children[i] != null && current.children[i].visited == false){
                    stack.push(current.children[i]);
                }
            }
        }

    }



    public static void DFSinorder(TreeNode head) {
        TreeNode current = head;
        stack.push(head);
        while (!stack.isEmpty()) {

            while(current.children[0] != null) {
                current = current.children[0];
                stack.push(current);

            }

            current = (TreeNode) stack.pop();
            System.out.println(current.name);

            if(current.children[1] != null){
                current= current.children[1];
                stack.push(current);
            }

        }

    }


    public static void BFS (TreeNode head){
        TreeNode current;
        queue.add(head);

        while(!queue.isEmpty()){
            current = (TreeNode) queue.remove();
            System.out.println(current.name);

            int size = current.children.length;


            for(int i = 0; i<size;i++){
                if(current.children[i] != null) {
                     queue.add(current.children[i]);
                }
            }

        }

    }






    public static void main (String[] args){

        TreeNode head = new TreeNode();
        head.name="head1";

        TreeNode left1 = new TreeNode();
        left1.name="left1";

        TreeNode right1 = new TreeNode();
        right1.name="right1";


        head.children[0] = left1;
        head.children[1] = right1;


        TreeNode leftleft = new TreeNode();
        leftleft.name="leftleft";

        TreeNode leftright = new TreeNode();
        leftright.name="leftright";

        left1.children[0] = leftleft;
        left1.children[1] = leftright;


        TreeNode rightleft = new TreeNode();
        rightleft.name="rightleft";

        TreeNode rightright = new TreeNode();
        rightright.name="rightright";

        right1.children[0] = rightleft;
        right1.children[1] = rightright;


        DFS(head);
        System.out.println();
        DFSinorder(head);
        System.out.println();
        BFS(head);

    }
}
