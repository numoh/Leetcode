package Easy.Plus_One;

import java.math.BigInteger;
import java.util.Arrays;

// 66
public class Solution {
    public static void main(String[] args) {
        int[] digits = new int[] { 7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    // Min lösning
    public static int[] plusOne(int[] digits) {
        BigInteger integer = BigInteger.valueOf(0);

        for (int i = 0; i < digits.length; i++) {
            integer = integer.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(digits[i]));
        }

        integer = integer.add(BigInteger.valueOf(1));

        int[] newDigits = new int[String.valueOf(integer).length()];
        for (int i = newDigits.length - 1; i >= 0; i--) {
            BigInteger newNumber = integer.mod(BigInteger.valueOf(10));
            newDigits[i] = Integer.parseInt(String.valueOf(newNumber));
            integer = integer.divide(BigInteger.valueOf(10));
        }

        return newDigits;
    }


    // Bättre lösning
    public static int[] plusOne1(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
