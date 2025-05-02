//https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
public class solution1 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5)); // 2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7)); // 4
    }

    public static int searchInsert(int[] nums, int target) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target > nums[i]) {
                n += 1;
            }
        }
        return n;
    }
}
