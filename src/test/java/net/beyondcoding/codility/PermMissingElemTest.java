/*
 * Copyright 2019 Applied Card Technologies Ltd
 */
package net.beyondcoding.codingproblems.net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class PermMissingElemTest
{
    private PermMissingElem permMissingElem;

    @Before
    public void setup()
    {
        permMissingElem = new PermMissingElem();
    }

    @Test
    public void shouldFindMissingElementInFirstPosition()
    {
        int[] inputArray = { 2, 3 };

        final int result = permMissingElem.solution( inputArray );
        assertEquals( 1, result );
    }

    @Test
    public void shouldFindMissingElementInSecondPosition()
    {
        int[] inputArray = { 1, 3 };

        final int result = permMissingElem.solution( inputArray );
        assertEquals( 2, result );
    }

    @Test
    public void shouldFindMissingElementForLastNumberInRange()
    {
        // 1 - 5 // 5 is missing
        int[] inputArray = { 4, 3, 2, 1 };

        final int result = permMissingElem.solution( inputArray );
        assertEquals( 5, result );
    }

    @Test
    public void shouldFindMissingElementInUnordedArray()
    {
        int[] inputArray = { 1, 8, 6, 3, 7, 9, 4, 2 };

        final int result = permMissingElem.solution( inputArray );
        assertEquals( 5, result );
    }


    @Test
    public void shouldReturnOneForEmptyArray()
    {
        final int result = permMissingElem.solution( new int[ 0 ] );
        assertEquals( 1, result );
    }

    @Test
    public void shouldReturnOneFor1ItemArray()
    {
        int[] inputArray = { 1 };
        final int result = permMissingElem.solution( inputArray );
        assertEquals( 2, result );
    }
}
