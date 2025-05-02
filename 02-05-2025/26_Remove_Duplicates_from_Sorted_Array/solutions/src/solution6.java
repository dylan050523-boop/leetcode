import java.util.Arrays;

class solution6 {
    public static void main(String[] args) {
//        int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
//        int[] noDupe = new int[nums.length];
//        int idx = 0;
//
//        if (nums[0] == 0) {
//            idx = 1;
//        }


        int n = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                n += 1;
                nums[i] = nums[i - 1];
            }
            System.out.println(Arrays.toString(nums));
        }
        return 0;

//        for (int i = 0; i < nums.length; i++) {
//            boolean match = false;
//            for (int j = 0; j < noDupe.length; j++) {
//                if (nums[i] == noDupe[j]) {
//                    match = true;
//                }
//            }
//            if (!match) {
//                noDupe[idx] = nums[i];
//                idx += 1;
//            }
//        }
//
//        for (int i = 0; i < idx; i++) {
//            nums[i] = noDupe[i];
//        }
//
//        return idx;
    }
}