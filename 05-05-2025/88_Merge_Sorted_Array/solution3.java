// https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

import java.util.Arrays;

public class solution3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2, 5, 6}, 3))); // {1, 2, 2, 3, 5, 6}
        System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0))); // {1}
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1))); // {1}
        
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0}, 3, new int[]{5, 6}, 2))); // {1, 2, 2, 3, 5, 6}
    }
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0; j < nums2.length; j++) {
            int idx = 0;
            for (int i = 0; i < m + j + 1 && nums2[j] >= nums1[i]; i++) {
                System.out.println("nums1: " + nums1[i] + " nums2: " + nums2[j]);
                idx = i;
            }
            int tempIdx = idx;
            for (int i = idx; nums1[tempIdx] != 0; i++) {
                tempIdx += 1;
                int temp = nums1[tempIdx];
                nums1[tempIdx] = nums1[idx];
                tempIdx += 1;
                nums1[tempIdx] = temp;
            }
            nums1[idx] = nums2[j];
            System.out.println("result: " + Arrays.toString(nums1));
        }
        return nums1;
    }
}
