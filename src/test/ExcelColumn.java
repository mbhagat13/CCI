package test;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumn {
    public static String convertToTitle(int columnNumber) {


        StringBuilder result = new StringBuilder("");
        int remainder = 0;
        Map<Integer, String> hashMap = new HashMap<Integer,String>();

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "D");
        hashMap.put(5, "E");
        hashMap.put(6, "F");
        hashMap.put(7, "G");
        hashMap.put(8, "H");
        hashMap.put(9, "I");
        hashMap.put(10, "J");
        hashMap.put(11, "K");
        hashMap.put(12, "L");
        hashMap.put(13, "M");
        hashMap.put(14, "N");
        hashMap.put(15, "O");
        hashMap.put(16, "P");
        hashMap.put(17, "Q");
        hashMap.put(18, "R");
        hashMap.put(19, "S");
        hashMap.put(20, "T");
        hashMap.put(21, "U");
        hashMap.put(22, "V");
        hashMap.put(23, "W");
        hashMap.put(24, "X");
        hashMap.put(25, "Y");
        hashMap.put(0, "Z");


        while (columnNumber  > 0){
            remainder = columnNumber % 26;
            result.insert(0,hashMap.get(remainder));

            if(remainder == 0)
                columnNumber--;

            columnNumber = columnNumber/26;
            System.out.println(columnNumber);

        }

        return result.toString();


    }

    public static void main(String[] args){
        System.out.println(convertToTitle(52));

    }

}
