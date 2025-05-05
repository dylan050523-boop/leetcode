//https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array

import java.util.*;
import java.lang.*;

public class solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static int[] plusOne(int[] digits) {
        int n = 0;
        for (int i = 0; i < digits.length; i++) {
            n += (int) (digits[i] * Math.pow(10, digits.length - i - 1));
        }
        n += 1;
        System.out.println(n);
        int temp = 0;
        System.out.println(n % 10 + "," +  n / 10);
//        while (n > 1) {
//            temp = n % 10;
//
//        }
        return digits;
    }
}
