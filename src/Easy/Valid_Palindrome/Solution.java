package Easy.Valid_Palindrome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("aca"));
    }

    public static boolean isPalindrome(String s) {
        String regex = "[a-zA-Z0-9]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group().toLowerCase());
        }

        if (result.length() == 0) return true;

        int leftPointer = 0, rightPointer = result.length() - 1;

        while (leftPointer < rightPointer) {
            if (result.charAt(leftPointer) == result.charAt(rightPointer)) {
                leftPointer++;
                rightPointer--;
            } else {
                return false;
            }
        }

        return true;
    }
}
