package arrayandhashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    
    @Test
    void testContainsDuplicate() {
        ContainsDuplicate sut = new ContainsDuplicate();
        assertFalse(sut.containsDuplicate(new int[]{}));
        assertFalse(sut.containsDuplicate(new int[]{1}));
        assertTrue(sut.containsDuplicate(new int[]{1, 1}));
        assertFalse(sut.containsDuplicate(new int[]{1, 2}));
        assertTrue(sut.containsDuplicate(new int[]{1, 2, 1}));
        assertTrue(sut.containsDuplicate(new int[]{1, 2, 1, 1}));
        assertTrue(sut.containsDuplicate(new int[]{1, 2, 1, 1, 2}));
        assertFalse(sut.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
        assertTrue(sut.containsDuplicate(new int[]{1, 2, 3, 4, 5, 1}));
        assertTrue(sut.containsDuplicate(new int[]{1, 2, 3, 4, 5, 1, 1}));
        assertTrue(sut.containsDuplicate(new int[]{0, 2, 3, 4, 5, 1, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14}));
    }
}
