package Easy.Number_of_Segments_in_a_String;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments("Hello"));
        System.out.println(countSegments(""));
        System.out.println(countSegments(", , , , a, eaefa"));
        System.out.println(countSegments("    foo    bar"));
        System.out.println(countSegments("                "));
    }

    public static int countSegments(String s) {
        if (s.trim().length() == 0) return 0;

        String[] sSplit = s.trim().split("[ ]+");

        return sSplit.length;
    }
}