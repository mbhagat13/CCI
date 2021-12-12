package test;

public class CountingChange {


    public static int countChange (int [] denoms, int index,int amount,int [][] map){

        if(index>= denoms.length - 1)
            return 1;

        if(map[amount][index] != 0){
            return map[amount][index];
        }

        int denomAmount = denoms[index];
        int ways = 0;
        for (int i = 0; i * denomAmount <= amount; i++){
            int amountRemaining = amount - i * denomAmount;
            ways = ways + countChange(denoms,index+1, amountRemaining,map);
        }
        map[amount][index] = ways;



        return ways;
    }


    public static void main (String [] args){
        int [] denoms = {5,2,1};
        int [][] map = new int[5 + 1][denoms.length];
        System.out.println(countChange(denoms,0,5, map));

    }

}
