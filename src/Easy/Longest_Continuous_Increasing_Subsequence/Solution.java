package Easy.Longest_Continuous_Increasing_Subsequence;

// 674
public class Solution {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
        System.out.println(findLengthOfLCIS(new int[]{3, 0, 6, 2, 4, 7, 0, 0}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int longestSeq = 0, pointer = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                pointer++;
                if (longestSeq < pointer) {
                    longestSeq = pointer;
                }
            } else {
                pointer = 0;
            }
        }

        return longestSeq + 1;
    }
}
