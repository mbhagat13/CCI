package chapterFour;

import dataStructures.TreeNode;

import java.util.Stack;

public class MinimalTree {

    public static Stack stack = new Stack();


    public static void createTree(int[] array, TreeNode head) {


        if (array.length == 2) {
            head.children[0] = new TreeNode(array[0]);

        } else {

            int[] lower;
            int[] upper;
            int midIndex = array.length / 2;


            lower = new int[(int) (array.length / 2)];

            if (array.length % 2 == 0) {
                upper = new int[(array.length / 2) - 1];
            } else {
                upper = new int[(int) (array.length / 2)];
            }

            for (int i = 0; i < array.length; i++) {
                if (i < midIndex) {
                    lower[i] = array[i];
                }
                if (i > midIndex) {
                    upper[i - midIndex - 1] = array[i];
                }
            }


            head.children[0] = new TreeNode(lower[lower.length / 2]);
            head.children[1] = new TreeNode(upper[upper.length / 2]);

            createTree(lower, head.children[0]);
            createTree(upper, head.children[1]);

        }

    }

    public static void DFS(TreeNode head) {
        head.visited = true;
        TreeNode current;
        stack.push(head);
        while (!stack.isEmpty()) {
            current = (TreeNode) stack.pop();
            System.out.println(current.data);

            int size = current.children.length;

            for (int i = size - 1; i >= 0; i--) {
                if (current.children[i] != null && current.children[i].visited == false) {
                    stack.push(current.children[i]);
                }
            }
        }

    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        TreeNode head = new TreeNode(array[array.length / 2]);


        createTree(array, head);


        System.out.println(head.data);
        System.out.println(head.children[0].data);
        System.out.println(head.children[0].children[0].data);
        System.out.println(head.children[0].children[1].children[0].data);
        System.out.println();
        DFS(head);

    }
}
