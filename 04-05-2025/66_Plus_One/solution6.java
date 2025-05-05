//https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array

import java.lang.*;
import java.util.*;

public class solution6 {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        // System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        // System.out.println(Arrays.toString(plusOne(new int[]{9})));
        
        // System.out.println(Arrays.toString(plusOne(new int[]{1, 1, 9})));        
        // System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));        
        // System.out.println(Arrays.toString(plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));        

        // System.out.println(Arrays.toString(plusOne(new int[]{1, 9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 3, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits[i] + ", " + Arrays.toString(digits));
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
