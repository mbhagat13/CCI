package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class romanNumeral {




    public static int romanToInt(String s) {
        Map <String,Integer> romanMap = new HashMap<>();
        int sum =0;

        romanMap.put(("I"),1);
        romanMap.put(("V"),5);
        romanMap.put(("X"),10);
        romanMap.put(("L"),50);
        romanMap.put(("C"),100);
        romanMap.put(("D"),500);
        romanMap.put(("IV"),4);
        romanMap.put(("IX"),9);
        romanMap.put(("XL"),40);
        romanMap.put(("XC"),90);
        romanMap.put(("CD"),400);
        romanMap.put(("CM"),900);


        for(int i = 0; i< s.length();i++){


            System.out.println(s.substring(i,i+1));

            if((i+2) <= s.length()){
                if(romanMap.containsKey(s.substring(i,i+2))){
                    sum = sum + (int) romanMap.get(s.substring(i,i+2));
                    i++;
                }else{
                    sum = sum + (int) romanMap.get(s.substring(i,i+1));
                }
            }else{
                sum = sum + (int) romanMap.get(s.substring(i,i+1));
            }


        }


        return sum;


    }
    public static void main (String [] args) {
       System.out.println(romanToInt("MCMXCIV"));
    }


}
