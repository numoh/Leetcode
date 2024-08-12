package Easy.Reverse_String;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        char[] s1 = new char[] {'h','e','l','l','o'};
        reverseString(s1);
        System.out.println("Solution s1: " + Arrays.toString(s1));

        char[] s2 = new char[] {'H','a','n','n','a', 'h'};
        reverseString(s2);
        System.out.println("Solution s2: " + Arrays.toString(s2));
    }

    public static void reverseString(char[] s) {
        int indexFromRight = s.length - 1;

        for (int i = 0; i < s.length; i++) { // h = 0, e = 1, l = 2, l = 3, o = 4
            if (indexFromRight == i || indexFromRight < i) break;
            char tmp = s[i];
            s[i] = s[indexFromRight];
            s[indexFromRight] = tmp;
            indexFromRight--;
        }
    }
}
