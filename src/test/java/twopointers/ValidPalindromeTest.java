package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {

    @Test
    void testValidPalindrome() {
        ValidPalindrome sut = new ValidPalindrome();
        assertTrue(sut.isValidPalindrome(""));
        assertTrue(sut.isValidPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(sut.isValidPalindrome("race a car"));
        assertTrue(sut.isValidPalindrome(" "));
        assertTrue(sut.isValidPalindrome("a!@#$"));
    }
}
