package arrayandhashing;

import java.util.HashMap;
import java.util.Map;

/** Problem: Contains Duplicate
 * Leetcode: <a href="https://leetcode.com/problems/contains-duplicate/">...</a>
 * Solution: Hashing
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class ContainsDuplicate {
    
    public boolean containsDuplicate(final int[] nums) {
        Map<Integer, Boolean> existed = new HashMap<>();
        for (Integer num : nums) {
            Boolean isExisted = existed.get(num);
            if (isExisted != null && isExisted) {
                return true;
            }
            existed.put(num, true);
        }
        return false;
    }
}
