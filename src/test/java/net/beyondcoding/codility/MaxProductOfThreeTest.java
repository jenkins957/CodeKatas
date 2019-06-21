package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductOfThreeTest
{
    @Test
    public void shouldSum3ElementArray()
    {
        final int array[] = { 1, 2, 3 };
        assertEquals(6, MaxProductOfThree.maxProductOfThree(array));
    }

    @Test
    public void shouldFindProductFromHighest3ElementInArray()
    {
        final int array[] = { 1, 2, 3, 4 };
        assertEquals(24, MaxProductOfThree.maxProductOfThree(array));
    }

    @Test
    public void shouldFindProductFromHighest3ElementInArrayWithASingleNegativeNumber()
    {
        final int array[] = { 1, -3, 2 };
        assertEquals(-6, MaxProductOfThree.maxProductOfThree(array));
    }

    @Test
    public void shouldFindProductFromHighest3ElementInArrayWithNegativeNumbers()
    {
        final int array[] = { -3, 1, 2, -2, 5, 6 };
        assertEquals(60, MaxProductOfThree.maxProductOfThree(array));
    }

    @Test
    public void shouldFindProductFromHighest3ElementInArrayWithATwoNegativeNumber()
    {
        final int array[] = { -5, 5, -5, 4 };
        assertEquals(125, MaxProductOfThree.maxProductOfThree(array));
    }
}
