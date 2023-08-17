package arrayandhashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {
    
    @Test
    void testValidAnagram() {
        ValidAnagram sut = new ValidAnagram();
        assertTrue(sut.isAnagram("", ""));
        assertTrue(sut.isAnagram("a", "a"));
        assertFalse(sut.isAnagram("a", "b"));
        assertTrue(sut.isAnagram("ab", "ba"));
        assertTrue(sut.isAnagram("anagram", "nagaram"));
        assertFalse(sut.isAnagram("rat", "car"));
    }
}
