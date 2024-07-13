package Medium.Container_With_Most_Water;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1, 8 ,6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[] {2, 3, 4, 5, 18, 17, 6}));
    }

    public static int maxArea(int[] height) {
        int leftPointer = 0, rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer != rightPointer) {
            maxArea = Math.max(maxArea, Math.min(height[rightPointer], height[leftPointer]) * (rightPointer - leftPointer));

            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxArea;
    }
}
