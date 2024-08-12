package Easy.Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[] {1, 1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> numbersMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            numbersMap.put(num, 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numbersMap.get(i + 1) == null) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
