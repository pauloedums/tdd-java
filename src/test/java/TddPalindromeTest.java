import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TddPalindromeTest {

    String[] palindromes = { "Rotator","bob","madam","mAlAyAlam","1","Able was I, ere I saw Elba","Madam I’m Adam","Step on no pets.","Top spot!","02/02/2020" };
    String[] notPalindromes = { "xyz","elephant","Country","Top . post!","Wonderful-fool","Wild imagination!"};


    @Test
    void testGetIsPalindromeResponse() {
        TddPalindrome palindrome = new TddPalindrome();
        for(String pl:palindromes) {
            String result = "Parabéns a sua palavra é um palíndromo: " + pl;
            assertEquals(palindrome.getPalindrome(pl).getEntity().toString(), result);
        }
    }

    @Test
    void testGetIsNotPalindromeResponse() {
        TddPalindrome palindrome = new TddPalindrome();
        for(String pl:notPalindromes) {
            String result = "O dado utilizado não é um palíndromo";
            assertEquals(palindrome.getPalindrome(pl).getEntity().toString(), result);
        }
    }

    @Test
    void testCheckIfIsPalindrome() {
        TddPalindrome palindrome = new TddPalindrome();
        for(String pl:palindromes) {
            assertEquals(palindrome.checkIfIsPalindrome(pl), true);
        }
    }

    @Test
    void testCheckIfIsNotPalindrome() {
        TddPalindrome palindrome = new TddPalindrome();
        for(String pl:notPalindromes) {
            assertEquals(palindrome.checkIfIsPalindrome(pl), false);
        }
    }
}
