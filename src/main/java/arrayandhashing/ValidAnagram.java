package arrayandhashing;

/** Problem: Valid Anagram
 * Leetcode: <a href="https://leetcode.com/problems/valid-anagram/">...</a>
 * Solution: Hashing
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class ValidAnagram {
    boolean isAnagram(final String s, final String t) {
        int[] frequencies = new int[26];
        for (char ch : s.toCharArray()) {
            frequencies[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            frequencies[ch - 'a']--;
        }
        for (int f : frequencies) {
            if (f != 0) {
                return false;
            }
        }
        return true;
    }
}
