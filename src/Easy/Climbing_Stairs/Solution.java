package Easy.Climbing_Stairs;

// 70
public class Solution {

    static int[] mem = new int[46];
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (mem[n] == 0) {
            mem[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return mem[n];
    }
}
