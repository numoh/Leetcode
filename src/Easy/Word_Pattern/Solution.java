package Easy.Word_Pattern;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }

    // My solution
//    public static boolean wordPattern(String pattern, String s) {
//        HashMap<String, Integer> hashMapForPattern = new HashMap<>();
//        HashMap<String, Integer> hashMapForS = new HashMap<>();
//        StringBuilder stringBuilderForPattern = new StringBuilder();
//        StringBuilder stringBuilderForS = new StringBuilder();
//        String[] sSplit = s.split(" ");
//
//        for (int i = 0; i < pattern.length(); i++) {
//            if (!hashMapForPattern.containsKey(String.valueOf(pattern.charAt(i)))) {
//                hashMapForPattern.put(String.valueOf(pattern.charAt(i)), i);
//                stringBuilderForPattern.append(hashMapForPattern.get(String.valueOf(pattern.charAt(i))) + 1);
//            } else {
//                stringBuilderForPattern.append(hashMapForPattern.get(String.valueOf(pattern.charAt(i))) + 1);
//            }
//        }
//
//        for (int i = 0; i < sSplit.length; i++) {
//            if (!hashMapForS.containsKey(sSplit[i])) {
//                hashMapForS.put(sSplit[i], i);
//                stringBuilderForS.append(hashMapForS.get(sSplit[i]) + 1);
//            } else {
//                stringBuilderForS.append(hashMapForS.get(sSplit[i]) + 1);
//            }
//        }
//
//        return stringBuilderForPattern.compareTo(stringBuilderForS) == 0;
//    }

    // Better solution

    // better solution
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
       
        if (words.length != pattern.length()) return false;
        
        HashMap<Character, String> charToWordMap = new HashMap<>();
        HashMap<String, Character> wordToCharMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWordMap.containsKey(c)) {
                if (!charToWordMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToCharMap.containsKey(word)) {
                    return false;
                }
                charToWordMap.put(c, word);
                wordToCharMap.put(word, c);
            }
        }

        return true;
    }

}
