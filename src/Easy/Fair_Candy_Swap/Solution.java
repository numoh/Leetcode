package Easy.Fair_Candy_Swap;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[] {1, 1}, new int[] {2, 2})));
        System.out.println(Arrays.toString(fairCandySwap(new int[] {1, 2}, new int[] {2, 3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[] {2}, new int[] {1, 3})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumOfAliceCandies = 0, sumOfBobCandies = 0;

        for (int a : aliceSizes) {
            sumOfAliceCandies += a;
        }

        for (int b : bobSizes) {
            sumOfBobCandies += b;
        }

        for (int aliceSize : aliceSizes) {
            for (int bobSize : bobSizes) {
                if (aliceSize == bobSize + ((sumOfAliceCandies - sumOfBobCandies) / 2)) {
                    return new int[]{aliceSize, bobSize};
                }
            }
        }

        return null;
    }
}
