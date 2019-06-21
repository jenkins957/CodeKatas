/*
 * Copyright 2019 Applied Card Technologies Ltd
 */
package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class PermCheckTest
{
    private PermCheck permCheck;

    @Before
    public void setup()
    {
        permCheck = new PermCheck();
    }

    @Test
    public void shouldBeValidPermutationForSingleElement()
    {
        final int array[] = { 1 };

        assertEquals( 1, permCheck.solution( array ) );
    }

    @Test
    public void shouldBeValidPermutationForThreeElementsInOrder()
    {
        final int array[] = { 1, 2, 3 };

        assertEquals( 1, permCheck.solution( array ) );
    }

    @Test
    public void shouldNotBeValidPermutationWhenNotStartingFrom1()
    {
        final int array[] = { 10, 11, 12 };

        assertEquals( 0, permCheck.solution( array ) );
    }

    @Test
    public void shouldBeValidPermutationForThreeElementsOutOfOrder()
    {
        final int array[] = { 3, 2, 1 };

        assertEquals( 1, permCheck.solution( array ) );
    }

    @Test
    public void shouldNotBeValidPermutationWhenContainsDuplicates()
    {
        final int array[] = { 3, 2, 1, 3, 2 };

        assertEquals( 0, permCheck.solution( array ) );
    }

    @Test
    public void shouldNotBeValidPermutationForEmptyArray()
    {
        final int array[] = new int[ 0 ];

        assertEquals( 0, permCheck.solution( array ) );
    }

    @Test
    public void shouldNotBeValidPermutationForTwoElements()
    {
        final int array[] = { 1, 3 };

        assertEquals( 0, permCheck.solution( array ) );
    }

    @Test
    public void shouldNotBeValidPermutationForSmallSizeArray()
    {
        final int array[] = { 2, 1, 3, 4, 5, 7, 6, 8, 11, 9, 12 };

        assertEquals( 0, permCheck.solution( array ) );
    }
}
