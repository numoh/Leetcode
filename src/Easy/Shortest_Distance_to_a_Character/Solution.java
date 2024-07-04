package Easy.Shortest_Distance_to_a_Character;

import java.util.ArrayList;
import java.util.Arrays;

// 821
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));
    }

    public static int[] shortestToChar(String s, char c) {
        ArrayList<Integer> characterC = new ArrayList();
        int[] distanceBetweenCharacters = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                characterC.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int ans = shortestDistance(i, characterC);
            distanceBetweenCharacters[i] = ans;
        }

        return distanceBetweenCharacters;
    }

    private static int shortestDistance(int i, ArrayList<Integer> characterC) {
        int res = 0;
        res = Math.abs(characterC.get(0) - i);

        for (int j = 1; j < characterC.size(); j++) {
            int shortestDistance = Math.abs(characterC.get(j) - i);
            if (shortestDistance < res) {
                res = shortestDistance;
            }
        }

        return res;
    }
}
