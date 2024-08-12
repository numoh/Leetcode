package Easy.Arranging_Coins;

public class Solution {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {
        int i = 1;

        while (n > 0) {
            i++;
            n -= i;
        }

        return i - 1;
    }
} 