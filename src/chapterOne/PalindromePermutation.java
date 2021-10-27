package chapterOne;

public class PalindromePermutation {



        public static void main (String [] args){
            int[] chars = new int[128];
            String str = "mehemmehemmehem";
            char [] inputChar = str.toCharArray();

            boolean result = true, even;

            for (int i =0;i < inputChar.length; i++) {
                chars[(int)inputChar[i]] = chars[(int)inputChar[i]] + 1;
            }

            if (str.length() %2 == 0){
                even = true;
            } else{
                even = false;
            }

            int oddCount = 0;

            System.out.println(even);

            for( int i = 0; i< chars.length; i++) {
                System.out.print(chars[i]);

                if ((chars[i] % 2 != 0)) {
                    if (even) {
                        result = false;
                        break;
                    } else {
                        oddCount++;
                    }

                }

                if (oddCount > 1) {
                    result = false;
                    break;
                }

            }
            System.out.println("\nresult: "  + result);

        }




}
