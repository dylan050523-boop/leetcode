// https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

import java.util.Arrays;

public class solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2, 5, 6}, 3))); // {1, 2, 2, 3, 5, 6}
        System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0))); // {1}
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1))); // {1}
    }
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // System.out.println(nums1.length);
        for (int i = m; i < nums1.length; i++) {
            // System.out.println("i: " + i + " nums1: " + nums1[i]);
            // System.out.println("nums2: " + nums2[i % nums2.length]);
            nums1[i] = nums2[i % nums2.length];
        }
        return nums1;
    }
}
