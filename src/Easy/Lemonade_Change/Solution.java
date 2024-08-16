package Easy.Lemonade_Change;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[] {5, 5, 5, 10, 20}));
        System.out.println(lemonadeChange(new int[] {5, 5, 10, 10, 20}));
        System.out.println(lemonadeChange(new int[] {10, 10}));
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 5, 5, 10, 20, 20, 20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int[] fivesAndTens = new int[2];

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fivesAndTens[0]++;
            } else if (bills[i] == 10) {
                if (fivesAndTens[0] == 0) {
                    return false;
                } else {
                    fivesAndTens[0]--;
                    fivesAndTens[1]++;
                }
            } else {
                if (fivesAndTens[1] >= 1 && fivesAndTens[0] >= 1) {
                    fivesAndTens[0]--;
                    fivesAndTens[1]--;
                } else if (fivesAndTens[0] > 2) {
                    fivesAndTens[0] -= 3;
                } else return false;
            }
        }

        return true;
    }
}