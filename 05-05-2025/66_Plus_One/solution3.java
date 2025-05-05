//https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array

import java.util.*;
import java.lang.*;

public class solution3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        
        System.out.println(Arrays.toString(plusOne(new int[]{1, 1, 9})));        
    }

    public static int[] plusOne(int[] digits) {
        int n = 0;
        for (int i = 0; i < digits.length; i++) {
            n += (int) (digits[i] * Math.pow(10, digits.length - i - 1));
        }
        n += 1;

        // bad code
        // if (n % 10 == 0) {
        //     int[] result = new int[digits.length + 1];
        // } else {
        //     int[] result = new int[digits.length];
        // }

        int _n = n;
        int count = 0;
        System.out.println("n: " + n);
        System.out.println(n % 10 + ", " + n / 10);
        System.out.println(n % 100 + ", " + n / 100);

        while (n > 0) {
            
        }

        return digits;
    }
}
