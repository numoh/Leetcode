package Easy.First_Unique_Character_in_a_String;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));
        System.out.println(firstUniqChar(s3));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> foundLetter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            foundLetter.put(s.charAt(i), foundLetter.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (foundLetter.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
