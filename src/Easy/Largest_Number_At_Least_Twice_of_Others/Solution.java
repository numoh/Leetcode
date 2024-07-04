package Easy.Largest_Number_At_Least_Twice_of_Others;

// 747
public class Solution {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
        System.out.println(dominantIndex(new int[] {1, 2, 3, 4}));
    }

    public static int dominantIndex(int[] nums) {

        int largestNumber = findLargestNumber(nums);
        int indexOfLargestNumber = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != largestNumber && nums[i] * 2 > largestNumber) {
                return -1;
            }
            if (nums[i] == largestNumber) indexOfLargestNumber = i;
        }

        return indexOfLargestNumber;
    }

    private static int findLargestNumber(int[] nums) {
        int largest = -1;

        for (int num : nums) {
            if (num > largest) largest = num;
        }

        return largest;
    }
}
