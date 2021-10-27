package chapterOne;

public class URLify {

    public static void main (String [] args){

        int numOfSpaces = 0;
        int trueLength = 0, initLength = 0, trueLengthIndex = 0;


        String end;
        String str =  "Mr John Smith and Meher Bhagat    ";
        char [] strAsChar = str.toCharArray();

        for (int i =0; i< strAsChar.length; i++){
            if (Character.compare(strAsChar[i],' ') == 0){
                numOfSpaces++;
            }
        }


        initLength = str.length();
        System.out.println(initLength);

        trueLength = str.length() + 2*numOfSpaces;
        System.out.println(trueLength);
        char [] outputChar = new char [trueLength];


        trueLengthIndex = trueLength - 1;

        for (int i =initLength -1; i>=0; i--) {

            if(Character.compare(strAsChar[i],' ') == 0){
                outputChar[trueLengthIndex] = '0';
                outputChar[trueLengthIndex - 1] = '2';
                outputChar[trueLengthIndex - 2] = '%';
                trueLengthIndex = trueLengthIndex -3;

            }else{
                outputChar[trueLengthIndex] = strAsChar[i];
                trueLengthIndex--;
            }
        }

       for (int i = 0; i < outputChar.length; i++){
           System.out.print(outputChar[i]);
       }
    }
}
