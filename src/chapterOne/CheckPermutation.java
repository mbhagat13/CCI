package chapterOne;

public class CheckPermutation {


    public static void main (String [] args){

        boolean result = true;

        String text1 = "meher";
        String text2 = "reher";

        int [] chars = new int[128];

        int letterNum = 0;

        if(text1.length() != text2.length()){
            System.out.println("Not possible");
            result = false;
        }


        for (int i = 0; i < text1.length();i++){

            letterNum = (int) text1.charAt(i);
            chars[letterNum]++;


            letterNum = (int) text2.charAt(i);
            chars[letterNum]--;
        }

        for (int i = 0; i < chars.length;i++){

            System.out.println(chars[i]);

            if(chars[i] != 0)
                result = false;

        }

        System.out.println(result);






        }
}
