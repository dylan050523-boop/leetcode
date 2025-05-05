// https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

import java.util.Arrays;

public class solution4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2, 5, 6}, 3))); // {1, 2, 2, 3, 5, 6}
        System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0))); // {1}
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1))); // {1}
        
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0}, 3, new int[]{5, 6}, 2))); // {1, 2, 2, 3, 5, 6}
    }
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }


        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
        return nums1;
    }
}
