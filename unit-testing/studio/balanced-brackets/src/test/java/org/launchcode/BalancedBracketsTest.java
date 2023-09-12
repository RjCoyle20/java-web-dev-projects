package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoPairsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void unfinishedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void misorderedBracketsreturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    @Test
    public void numbersDoNotMakeAlter () {
        String message = "A string containing numbers does not alter result";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[867][5309]"));
    }
    @Test
    public void specialCharactersDoNotAlter() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[#@$  %&*&*(#%]"));
    }
    @Test
    public void closingBracketLeadingStringsFail() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][]"));
    }
    @Test
    public void closingBracketsAtEndFail() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]"));
    }

    @Test
    public void laterMisorderedBracketsFail() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]["));
    }

    @Test
    public void superNestPasses () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[[]]]]]]]]]]"));
    }
}