package Medium.Reverse_Integer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        long res = 0;

        while (x != 0) {
            res = res * 10 + (x % 10);
            x /= 10;

            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }

        return (int) res;
    }
}
