package twopointers;

/** Problem: Valid Palindrome
 * Leetcode: <a href="https://leetcode.com/problems/valid-palindrome/">...</a>
 * Solution: Two pointers
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class ValidPalindrome {
    public boolean isValidPalindrome(final String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        String normalized = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = normalized.length() - 1;
        while (left <= right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
