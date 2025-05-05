//https://leetcode.com/problems/remove-element/submissions/1623423457/?envType=problem-list-v2&envId=array

import java.util.Arrays;

class solution1 {
    public static void main(String[] args) {
        solution1 solution1 = new solution1();

        // 테스트 케이스 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution1.removeElement(nums1, val1);
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", val = " + val1);
        System.out.println("Output: k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, k1))); // 예상 출력: k = 2, nums = [2, 2]

        // 테스트 케이스 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution1.removeElement(nums2, val2);
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", val = " + val2);
        System.out.println("Output: k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOf(nums2, k2))); // 예상 출력: k = 5, nums = [0, 1, 3, 0, 4]
    }

    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[n] = nums[i];
                n += 1;
            }
        }
        return n;
    }
}