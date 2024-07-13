package Medium.Integer_to_Roman;

public class Solution {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();

        Integer[] keys = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] values = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        int indexFromRight = keys.length - 1;

        while (num != 0) {
            if (num - keys[indexFromRight] >= 0) {
                res.append(values[indexFromRight]);
                num -= keys[indexFromRight];
            } else {
                indexFromRight--;
            }
        }

        return res.toString();
    }
}
