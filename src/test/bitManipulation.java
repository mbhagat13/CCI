package test;

public class bitManipulation {

    public static void main (String[] args){
        int num = 14;



        int mask = ~((1<< 4)  - 1);
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(mask & num));




    }
}
