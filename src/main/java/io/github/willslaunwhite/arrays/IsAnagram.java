package io.github.willslaunwhite.arrays;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return new String(sArr).equals(new String(tArr));
    }
}
