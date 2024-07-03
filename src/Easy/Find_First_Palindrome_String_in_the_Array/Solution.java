package Easy.Find_First_Palindrome_String_in_the_Array;

// 2108
public class Solution {

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
        System.out.println(firstPalindrome(new String[]{"notapalindrome", "racecar"}));
        System.out.println(firstPalindrome(new String[]{"def", "ghi"}));
    }



    public static String firstPalindrome(String[] words) {
        StringBuilder reverseOfWord = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            reverseOfWord.append(words[i]);
            reverseOfWord.reverse();
            if (words[i].contentEquals(reverseOfWord)) {
                return words[i];
            }
            reverseOfWord.delete(0, words[i].length());
        }

        return "";
    }
}
