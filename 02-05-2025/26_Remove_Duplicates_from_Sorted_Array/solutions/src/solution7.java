import java.util.Arrays;

class solution7 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        nums = new int[]{1, 2, 3, 4, 4, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[n]) {
                n += 1;
                nums[n] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return n + 1;
    }
}