package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

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
    public void singleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleRightBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void outsideWordBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    public void insideWordBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("w[o]rd"));
    }

    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word][word]"));
    }

    @Test
    public void balancedWithUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word][word"));
    }

    @Test
    public void balancedWithExtraBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word]word]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse() {
        //failed
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void backwardsBracketsInWordReturnsFalse() {
        //failed
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }


}


