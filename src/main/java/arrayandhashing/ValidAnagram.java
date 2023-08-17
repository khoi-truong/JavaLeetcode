package arrayandhashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        Map<Character, Integer> sChars = new HashMap<>();
        for (char sChar : s.toCharArray()) {
            sChars.put(sChar, sChars.getOrDefault(sChar, 0) + 1);
        }
        for (char tChar : t.toCharArray()) {
            Integer count = sChars.getOrDefault(tChar, 0);
            if (count == 0) {
                return false;
            }
            if (count == 1) {
                sChars.remove(tChar);
            } else {
                sChars.put(tChar, sChars.get(tChar) - 1);
            }
        }
        return sChars.keySet().isEmpty();
    }
}
