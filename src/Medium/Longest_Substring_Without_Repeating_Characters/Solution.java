package Medium.Longest_Substring_Without_Repeating_Characters;

import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    public static int lengthOfLongestSubstring(String s) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        int sizeOfLongestSubstring = 0;
        int firstIndex = 0, lastIndex;

        for (int i = 0; i < s.length(); i++) {
            if (!hashtable.containsKey(String.valueOf(s.charAt(i)))) {
                hashtable.put(String.valueOf(s.charAt(i)), i);
            } else {
                if (firstIndex <= hashtable.get(String.valueOf(s.charAt(i)))) {
                    firstIndex = hashtable.get(String.valueOf(s.charAt(i))) + 1;
                }
                hashtable.put(String.valueOf(s.charAt(i)), i);
            }
            lastIndex = i;
            if (sizeOfLongestSubstring < Math.abs(firstIndex - lastIndex) + 1) {
                sizeOfLongestSubstring = Math.abs(firstIndex - lastIndex) + 1;
            }
        }

        return sizeOfLongestSubstring;
    }
}
