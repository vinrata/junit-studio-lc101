package test;

import org.junit.Test;

import static org.junit.Assert.*;
public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void bracketTestTwoBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));

    }
    @Test
    public void bracketTestWithLaunchCode(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }
    @Test
    public void bracketTestWithLaunchandCodeInBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("Launch[Code]"));

    }
    @Test
    public void bracketTestEmptyString(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));

    }
    @Test
    public void bracketTestFalseLaunchCodeInBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void bracketTestFalseLaunchCodeCloseBracketCodeOpenBracket(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void bracketTestFalseOneOpenBracket(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("["));

    }

    @Test
    public void bracketTestFalseBackwardsBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("]["));

    }
}
