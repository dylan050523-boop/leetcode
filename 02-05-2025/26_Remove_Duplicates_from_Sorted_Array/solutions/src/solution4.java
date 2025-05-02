import java.util.Arrays;

class solution4 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;

        if (nums[0] == 0) {
            idx = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            boolean match = false;
            for (int j = 0; j < arr.length; j++) {
                if (nums[i] == arr[j]){
                    match = true;
                }
            }
            if (!match) {
                arr[idx] = nums[i];
                idx += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        return idx;
    }
}