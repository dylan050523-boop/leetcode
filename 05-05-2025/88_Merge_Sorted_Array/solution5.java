// https://leetcode.com/problems/merge-sorted-array/?envType=problem-list-v2&envId=array

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

import java.util.Arrays;

public class solution5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2, 5, 6}, 3))); // {1, 2, 2, 3, 5, 6}
        // System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0))); // {1}
        // System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1))); // {1}
        
        // System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0}, 3, new int[]{5, 6}, 2))); // {1, 2, 2, 3, 5, 6}
    }
    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // nums1의 마지막 유효 요소 인덱스
        int p2 = n - 1; // nums2의 마지막 요소 인덱스
        int p = m + n - 1; // 병합된 배열의 마지막 위치 인덱스
        System.out.println(p1 + ", " + p2 + ", " + p);

        while (p1 >= 0 && p2 >= 0) {
            System.out.println("p1: " + nums1[p1] + " p2: " + nums2[p2]);
            if (nums1[p1] > nums2[p2]) {
                System.out.println("p1 > p2");
                nums1[p--] = nums1[p1--];
                System.out.println("nums1: " + Arrays.toString(nums1));
            } else {
                System.out.println("p2 > p1");
                nums1[p--] = nums2[p2--];
                System.out.println("nums1: " + Arrays.toString(nums1));
                System.out.println("nums2: " + Arrays.toString(nums2));
            }
        }

        // nums2에 남은 요소가 있다면 nums1의 앞부분에 복사
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
        return nums1;
    }
}
