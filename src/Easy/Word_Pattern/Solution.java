package Easy.Word_Pattern;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<String, Integer> hashMapForPattern = new HashMap<>();
        HashMap<String, Integer> hashMapForS = new HashMap<>();
        StringBuilder stringBuilderForPattern = new StringBuilder();
        StringBuilder stringBuilderForS = new StringBuilder();
        String[] sSplit = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            if (!hashMapForPattern.containsKey(String.valueOf(pattern.charAt(i)))) {
                hashMapForPattern.put(String.valueOf(pattern.charAt(i)), i);
                stringBuilderForPattern.append(hashMapForPattern.get(String.valueOf(pattern.charAt(i))) + 1);
            } else {
                stringBuilderForPattern.append(hashMapForPattern.get(String.valueOf(pattern.charAt(i))) + 1);
            }
        }

        for (int i = 0; i < sSplit.length; i++) {
            if (!hashMapForS.containsKey(sSplit[i])) {
                hashMapForS.put(sSplit[i], i);
                stringBuilderForS.append(hashMapForS.get(sSplit[i]) + 1);
            } else {
                stringBuilderForS.append(hashMapForS.get(sSplit[i]) + 1);
            }
        }

        return stringBuilderForPattern.compareTo(stringBuilderForS) == 0;
    }
}
