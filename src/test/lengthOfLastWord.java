package test;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        int counter = 0;
        for (int i = s.length()-1; i>=0; i--){
            while(s.charAt(i) == ' '){
                i--;
            }
            System.out.println(s.charAt(i));


            if(s.charAt(i) == ' '){

                break;
            }else{
                counter++;
            }
        }
        return counter;
    }

    public static void main(String [] args){
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }


}
