// https://school.programmers.co.kr/learn/courses/30/lessons/120885?language=java

import java.util.Arrays;

public class solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 0}, new int[]{1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1,0,0,1}, new int[]{1,1,1,1})));
    }

    public static int[] solution(int[] bin1, int[] bin2) {
        int[] answer = new int[bin1.length];
        boolean temp = false;
        for (int i = bin1.length - 1; i >= 0; i--) {
            if (bin1[i] == 1 && (bin2[i] == 1 || temp)) {
                temp = false;
                temp = true;
            }
        }
    
        // for (int i = 0; i < bin1.length; i++) {
        //     if (bin1[i] == 1 || bin2[i] == 1) {
                
        //     }
        // }
        return answer;
    }
}
