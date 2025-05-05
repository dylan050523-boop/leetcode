// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/?envType=problem-list-v2&envId=string

import java.util.HashMap;

public class solution2 {
    public static void main(String[] args) {
        areOccurrencesEqual("abacbc"); // true
        areOccurrencesEqual("aaabb"); // false
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> stringCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stringCount.containsKey(s.charAt(i))) {
                stringCount.put(s.charAt(i), 0);
            }
            System.out.println(stringCount);
            System.out.println(stringCount.get(s.charAt(i)));
            stringCount.replace(s.charAt(i), stringCount.get(s.charAt(i)), stringCount.get(s.charAt(i)) + 1);
        }

        System.out.println("final " + stringCount);
        
        return true;
    }
}
