package com.Lewis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    private MyClass m;

    @Test
    public void testCorrectPalindrome() {
        // this will test for a known palindrome
        int[] array = new int[] { 1, 2, 3, 2, 1 };
        assertEquals(true, m.isPalindrome(array));
    }

    @Test
    public void testIncorrectPalindrome() {
        // this will test for a random sequence
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        assertEquals(false, m.isPalindrome(array));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testLessThanOneElement() {
        // this will test for an array with 0 elements
        int[] array = new int[] { };
        assertEquals(false, m.isPalindrome(array));
    }

    public MyClassTest() {
        m = new MyClass();
    }
}