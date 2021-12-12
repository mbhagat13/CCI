package dataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashTableCustom{

    private ArrayList<LinkedList> hash = new ArrayList<LinkedList>();
    private int buckets = 5;
    public HashTableCustom(){
        LinkedList<Integer> temp;
        for(int i =0;i<buckets;i++){
            temp = new LinkedList();
            hash.add(temp);
        }
    }

    public void addToHash (int n){
        int index = n%buckets;
        LinkedList<Integer> temp = hash.get(index);

        for (int i =0;i< temp.size();i++){
            if(temp.get(i) == n) {
                System.out.println("already exists");
                return;
            }
        }
        temp.add(n);
    }

    public boolean hashContains (int n) {
        int index = n%buckets;
        LinkedList<Integer> temp = hash.get(index);

        for (int i =0;i< temp.size();i++){
            if(temp.get(i) == n) {
                System.out.println("i:" + i +" index:" + index);
                return true;
            }
        }
        return false;
    }

    public void outputHash(){
        for(int i =0;i<buckets;i++){
            LinkedList<Integer> temp = hash.get(i);
            for(int j = 0; j< temp.size();j++){
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }
    }

    }
