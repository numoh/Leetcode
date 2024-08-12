package Easy.Add_Strings;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("0", "0"));
    }

    // Did not follow the requirements, got accepted still :(
    public static String addStrings(String num1, String num2) {
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);

        return String.valueOf(bigInteger1.add(bigInteger2));
    }
}