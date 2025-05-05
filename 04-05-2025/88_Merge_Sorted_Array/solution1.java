// https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

public class solution1 {
    public static void main(String[] args) {
        System.out.println(merge({1,2,3,0,0,0}, 3, {2, 5, 6}, 3)); // {1, 2, 2, 3, 5, 6}
        System.out.println(merge({1}, 1, {}, 0)); // {1}
        System.out.println(merge({0}, 0, {1}, 1)); // {1}
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums1.length; i++) {
            
        }
    }
}
