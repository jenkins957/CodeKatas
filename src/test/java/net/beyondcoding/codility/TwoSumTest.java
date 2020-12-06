package net.beyondcoding.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest
{
    @Test
    public void shouldMatchTargetIn2DigitArray()
    {
        final int input[] = { 2, 8 };
        final TwoSum twoSum = new TwoSum();

        assertArrayEquals( new int[] { 0, 1 }, twoSum.twoSum( input, 10 ) );
    }

    @Test
    public void shouldMatchTargetIn3DigitArray()
    {
        final int input[] = { 5, 2, 8 };
        final TwoSum twoSum = new TwoSum();

        assertArrayEquals( new int[] { 1, 2 }, twoSum.twoSum( input, 10 ) );
    }

    @Test
    public void shouldMatchTargetInArray()
    {
        final int input[] = { 5, 2, 8, 4, 9, 11, 22, 3, 12, 99, 1, 33 };
        final TwoSum twoSum = new TwoSum();

        assertArrayEquals( new int[] { 2, 9 }, twoSum.twoSum( input, 107 ) );
    }

    @Test
    public void shouldNotMatchTargetInArray()
    {
        final int input[] = { 5, 2, 8, 4, 9, 11, 22, 3, 12, 99, 1, 33 };
        final TwoSum twoSum = new TwoSum();

        assertNull( twoSum.twoSum( input, 200 ) );
    }

    @Test
    public void shouldNotMatchTargetInArray_2()
    {
        final int input[] = { 6, 2, 8, };
        final TwoSum twoSum = new TwoSum();

        assertNull( twoSum.twoSum( input, 12 ) );
    }

    @Test
    public void shouldNotMatchTargetIn1DigitArray()
    {
        final int input[] = { 5 };
        final TwoSum twoSum = new TwoSum();

        assertNull( twoSum.twoSum( input, 5 ) );
    }

    @Test
    public void shouldNotMatchTargetInEmptyArray()
    {
        final int input[] = new int[0];
        final TwoSum twoSum = new TwoSum();

        assertNull( twoSum.twoSum( input, 10 ) );
    }
}