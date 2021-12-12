package test;

import java.util.ArrayList;

public class PowerSet {

    public static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> set, int index){

        ArrayList<ArrayList<Integer>> allSubsets;

        if(set.size() == index){
            allSubsets = new ArrayList<ArrayList<Integer>>();
            allSubsets.add(new ArrayList<Integer>());
        }else {
            allSubsets = powerSet(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> subset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }



    public static void main (String [] args){
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> output;
        inputs.add(1);
        inputs.add(2);
        inputs.add(3);

        output = powerSet(inputs,0);

        for(int i =0; i< output.size();i++){
            inputs = output.get(i);
            for (int j = 0;j<inputs.size();j++){
                System.out.print(inputs.get(j) + " ");
            }
            System.out.println();
        }


    }
}
