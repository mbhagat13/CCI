package chapterOne;


public class StringCompression {

    public static void main (String [] args){


        String str = "aabcccccaaa";
        StringBuilder joinStr = new StringBuilder();
        int index = 0, counter = 1;
        String outputStr = "";
        char letter;

        letter = str.charAt(index);

        for(index = 1; index <str.length(); index++){

            if(Character.compare(str.charAt(index),letter) == 0){
                counter = counter +1;

            }else{

                joinStr.append((letter));
                joinStr.append((counter));
                letter = str.charAt(index);
                counter =1;
            }

        }


        System.out.println(joinStr.toString());


    }

}
