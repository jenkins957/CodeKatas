/*
 * Copyright 2019 Applied Card Technologies Ltd
 */
package net.beyondcoding.codingproblems.net.beyondcoding.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class CyclicRotationTest
{
    private CyclicRotation cyclicRotation;
    private static final int ONE_ELEMENT_ARRAY[] = { 1 };
    private static final int THREE_ELEMENT_ARRAY[] = { 1, 2, 3 };

    @Before
    public void setup()
    {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void shouldRotateOneElementArrayToRightBy0Places()
    {
        final int expected[] = { 1 };

        final int[] result = cyclicRotation.solution( ONE_ELEMENT_ARRAY, 0 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateOneElementArrayToRightBy1Place()
    {
        final int expected[] = { 1 };

        final int[] result = cyclicRotation.solution( ONE_ELEMENT_ARRAY, 1 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateOneElementArrayToRightBy2Places()
    {
        final int expected[] = { 1 };

        final int[] result = cyclicRotation.solution( ONE_ELEMENT_ARRAY, 2 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy2Places()
    {
        final int expected[] = { 2, 3, 1 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 2 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy3Place()
    {
        final int expected[] = { 1, 2, 3 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 3 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy4Places()
    {
        final int expected[] = { 3, 1, 2 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 4 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy5Places()
    {
        final int expected[] = { 2, 3, 1 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 5 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy7Places()
    {
        final int expected[] = { 3, 1, 2 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 7 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy9Places()
    {
        final int expected[] = { 1, 2, 3 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 9 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayToRightBy10Places()
    {
        final int expected[] = { 3, 1, 2 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 10 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldReturnEmptyArrayWhenInputArrayIsEmpty()
    {
        final int emptyArray[] = new int[ 0 ];
        final int expected[] = new int[ 0 ];

        final int[] result = cyclicRotation.solution( emptyArray, 1 );
        Assert.assertArrayEquals( expected, result );
    }
}
