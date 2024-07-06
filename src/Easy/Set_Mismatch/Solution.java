package Easy.Set_Mismatch;

import java.util.Arrays;
import java.util.HashMap;

// 645
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }

    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> numbersMap = new HashMap<>();
        int[] errorNums = new int[2];

        for (int num : nums) {
            numbersMap.put(num, numbersMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numbersMap.get(i + 1) != null && numbersMap.get(i + 1) == 2) {
                errorNums[0] = i + 1;
            }
            if (numbersMap.get(i + 1) == null) {
                errorNums[1] = i + 1;
            }
        }

        return errorNums;
    }
}
