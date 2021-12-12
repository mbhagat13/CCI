package dataStructures;

import java.util.BitSet;

public class bitSetExample {

        public static void main (String [] args){
                BitSet bitSet = new BitSet(100_000);

                bitSet.set(10);

                int num = 13;
                System.out.println(num & (1<<2));
                System.out.println();



        }

}
