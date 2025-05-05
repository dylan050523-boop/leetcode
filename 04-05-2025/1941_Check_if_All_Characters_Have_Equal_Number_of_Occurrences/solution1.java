// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/?envType=problem-list-v2&envId=string

import java.util.*;

public class solution1 {
    public static void main(String[] args) {
        areOccurrencesEqual("abacbc"); // true
        areOccurrencesEqual("aaabb"); // false
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<String, Integer> stringCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            stringCount.put(String.valueOf(s.charAt(i)), 0);
        }

        return true;
    }
}
