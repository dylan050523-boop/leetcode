import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class solution3 {
    /*
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     *
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * */
//        int[] nums = {1, 1, 2}; // case 1
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // case 2

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
//            System.out.println("arr" + Arrays.toString(arr));
        }
    }
}