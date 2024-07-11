package Hard.Median_of_Two_Sorted_Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int sizeOfNums1 = nums1.length, sizeOfNums2 = nums2.length;
        int indexForNum1 = 0, indexForNum2 = 0, indexForMergedArray = 0;

        while (sizeOfNums1 > 0 && sizeOfNums2 > 0) {
            if (nums1[indexForNum1] < nums2[indexForNum2]) {
                mergedArray[indexForMergedArray] = nums1[indexForNum1];
                indexForNum1++;
                sizeOfNums1--;
            } else {
                mergedArray[indexForMergedArray] = nums2[indexForNum2];
                indexForNum2++;
                sizeOfNums2--;
            }
            indexForMergedArray++;
        }

        if (sizeOfNums1 > 0) {
            while (sizeOfNums1 > 0) {
                mergedArray[indexForMergedArray] = nums1[indexForNum1];
                indexForNum1++;
                sizeOfNums1--;
                indexForMergedArray++;
            }
        } else if (sizeOfNums2 > 0) {
            while (sizeOfNums2 > 0) {
                mergedArray[indexForMergedArray] = nums2[indexForNum2];
                indexForNum2++;
                sizeOfNums2--;
                indexForMergedArray++;
            }
        }

        if (mergedArray.length % 2 == 0) {
            int firstIndex = mergedArray.length / 2;
            int secondIndex = firstIndex - 1;
            return (double) (mergedArray[firstIndex] + mergedArray[secondIndex]) / 2;
        } else {
            return mergedArray[mergedArray.length / 2];
        }
    }
}
