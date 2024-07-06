package Easy.Single_Number;

// 136
public class Solution {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{ 2, 2, 1 }));
        System.out.println(singleNumber(new int[]{ 4, 1, 2, 1, 2 }));
        System.out.println(singleNumber(new int[]{ 1 }));
    } // 1, 9, 1

    public static int singleNumber(int[] nums) {
        int res = 0;

        for (int num : nums) {
            res ^= num;
        }
        System.gc();
        return res;
    }
}
