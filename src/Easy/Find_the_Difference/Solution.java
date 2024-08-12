package Easy.Find_the_Difference;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
    }

    public static char findTheDifference(String s, String t) {
        int sum = 0;

        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }

        return (char) sum;
    }
}