package Easy.Uncommon_Words_from_Two_Sentences;

import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] totalSplit = Stream.concat(Arrays.stream(s1.split(" ")), Arrays.stream(s2.split(" ")))
                .toArray(String[]::new);

        Map<String, Integer> wordCount = new HashMap<>();

        for (String s : totalSplit) {
            wordCount.put(s, wordCount.getOrDefault(s, 0) + 1);
        }

        List<String> uncommonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        return uncommonWords.toArray(new String[0]);
    }
}
