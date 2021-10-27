package chapterOne;

public class IsUnique {

    public static void main(String[] args) {
        int[] chars = new int[128];

        String text = "thisisasampletext";
        String text2 = "asdfghjklqwertyuiop";

        int letter = 0;

        for (int i = 0; i < text2.length(); i++) {

            letter = (int) text2.charAt(i);

            chars[letter] = chars[letter] + 1;
            if (chars[letter] >= 2) {
                System.out.println("This has multiple of the same characters");
                break;
            }

        }
    }
}
