package Easy.Is_Subsequence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (j != s.length() && s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }
        return j == s.length();
    }
}
