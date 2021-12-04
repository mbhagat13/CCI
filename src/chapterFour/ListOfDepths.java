package chapterFour;

import dataStructures.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ListOfDepths {

    public static Queue queue = new ArrayDeque();

    public static void BFS (TreeNode head, ArrayList list){

        System.out.println(head.name);


        for(int i = 0; i<2;i++){
            if(head.children[i] != null) {
                BFS(head.children[i], list);
            }
        }


    }


    public static void main (String args[]){

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

        ArrayList<LinkedList> list = new ArrayList();

        BFS(head,list);

    }

}
