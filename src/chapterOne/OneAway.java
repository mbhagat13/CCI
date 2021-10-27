package chapterOne;

public class OneAway {


    public static boolean sameLength (String str1, String str2){


        int differenceCounter = 0;
        for (int i =0; i < str1.length(); i++){
            if(Character.compare(str1.charAt(i),str2.charAt(i)) != 0)
                differenceCounter++;

        }

        if(differenceCounter > 1){
            return false;
        }

        //if (numOfInterations == str1.length()-1){
          //  return false;

        return true;
    }


    public static boolean plusOneLength (String str1, String str2) {

        String larger, smaller;
        int differenceIndex = 0;

        if (str1.length() > str2.length()){
            larger = str1;
            smaller = str2;
        }else{
            larger = str2;
            smaller = str1;
        }

        for (int i = 0; i < larger.length(); i++){

            if(Character.compare(larger.charAt(i),smaller.charAt(i - differenceIndex)) != 0){
                differenceIndex++;
            }

            if (differenceIndex >1){
                return false;
            }

        }

        return true;
    }

        public static void main (String [] args){

        String str1 = "pales", str2 = "pals";

        boolean result;
        //Compare size, determine algorithim
        if((str1.length() - 1 == str2.length()) || (str2.length() - 1 == str1.length())){
            result = plusOneLength(str1, str2);

        }else if (str1.length() == str2.length()){
            result = sameLength(str1, str2);
        }else{
            result = false;
        }


        System.out.println("result: " + result);

    }
}
