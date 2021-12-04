package test;

public class TripleStep {


    public static int tripleStep(int num){
        if(num < 0)
            return 0;
        else if(num == 0){
            return 1;
        }else
            return tripleStep(num-1) + tripleStep(num-2) + tripleStep(num-3);
    }

    public static void main (String [] args){
        System.out.println(tripleStep(4));

    }
}
