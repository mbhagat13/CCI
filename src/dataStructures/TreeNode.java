package dataStructures;


public class TreeNode {

    public String name = "";
    public TreeNode [] children = new TreeNode[2];
    public boolean visited = false;
    public int data = 0;
    public TreeNode (int d){
        data = d;
    }
    public TreeNode(){


    }

}
