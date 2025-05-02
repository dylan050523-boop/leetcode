//https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

import java.util.HashMap;
import java.util.Arrays;

class solution1 {
    public static void main(String[] args) {
        solution1 solution = new solution1();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(result1)); // 예상 출력: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + Arrays.toString(result2)); // 예상 출력: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Output: " + Arrays.toString(result3)); // 예상 출력: [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

//        System.out.println("numMap before: " + numMap);

        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

//        System.out.println("numMap after: " + numMap);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        return null;
    }
}