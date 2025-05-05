// https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array

import java.lang.*;
import java.util.*;

public class solution4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        
        System.out.println(Arrays.toString(plusOne(new int[]{1, 1, 9})));        
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));        

    }

    public static int[] plusOne(int[] digits) {
        int n = 0;
        for (int i = 0; i < digits.length; i++) {
            n += (int) (digits[i] * Math.pow(10, digits.length - i - 1));
        }
        n += 1;
        String str = Integer.toString(n);
        int[] result = new int[str.length()];

        System.out.println("n : " + n);

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }

        return result;
    }
}
