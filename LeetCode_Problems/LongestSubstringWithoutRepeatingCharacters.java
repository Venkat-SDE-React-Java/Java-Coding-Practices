package LeetCode_Problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubString(String s) {
        if (s == "") {
            return 0;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int maxCount = 0;
        int tempCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            //System.out.println("KEY " + key);
            if (!map.containsKey(key)) {
                map.put(key, i);
                //System.out.println("New " + map);
                tempCount++;
            } else {
                Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
                //                System.out.println("Iterator initiated");
                while (iterator.hasNext()) {
                    Map.Entry<Character, Integer> entry = iterator.next();
                    Character key2 = entry.getKey();
                    if (key2 == key) {
                        // System.out.println("Removed " + key2);
                        iterator.remove();
                        tempCount--;
                        break;
                    } else {
                        //System.out.println("Removed " + key2);
                        iterator.remove();
                        tempCount--;
                    }
                }
                //System.out.println("Added " + key);
                map.put(key, i);
                // System.out.println("New " + map);
                tempCount++;
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "ohomm";
        System.out.println(longestSubString(s));
    }
}