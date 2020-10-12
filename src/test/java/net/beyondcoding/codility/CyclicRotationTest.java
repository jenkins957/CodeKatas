package net.beyondcoding.codility;

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
    private static final int TWO_ELEMENT_ARRAY[] = { 1, 2 };
    private static final int THREE_ELEMENT_ARRAY[] = { 1, 2, 3 };

    @Before
    public void setup()
    {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void shouldNotRotateEmptyArray()
    {
        final int expected[] = { };

        final int[] result = cyclicRotation.solution( new int[0], 0 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldNotRotateOneElementArray()
    {
        final int expected[] = { 1 };

        int[] result = cyclicRotation.solution( ONE_ELEMENT_ARRAY, 0 );
        Assert.assertArrayEquals( expected, result );

        result = cyclicRotation.solution( ONE_ELEMENT_ARRAY, 1 );
        Assert.assertArrayEquals( expected, result );

        result = cyclicRotation.solution( ONE_ELEMENT_ARRAY, 2 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateTwoElementArrayBy1Place()
    {
        final int expected[] = { 2, 1 };

        final int[] result = cyclicRotation.solution( TWO_ELEMENT_ARRAY, 1 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateTwoElementArrayBy2Places()
    {
        // 2 element array rotated twice ends up in same place!
        final int expected[] = { 1, 2 };

        final int[] result = cyclicRotation.solution( TWO_ELEMENT_ARRAY, 2 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateTwoElementArrayBy3Places()
    {
        final int expected[] = { 2, 1 };

        final int[] result = cyclicRotation.solution( TWO_ELEMENT_ARRAY, 3 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateTwoElementArrayBy4Places()
    {
        // 2 element array rotated four times ends up in same place!
        final int expected[] = { 1, 2 };

        final int[] result = cyclicRotation.solution( TWO_ELEMENT_ARRAY, 4 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayBy1Place()
    {
        final int expected[] = { 3, 1, 2 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 1 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayBy2Places()
    {
        final int expected[] = { 2, 3, 1 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 2 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayBy3Places()
    {
        // back to same place
        final int expected[] = { 1, 2, 3 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 3 );
        Assert.assertArrayEquals( expected, result );
    }

    @Test
    public void shouldRotateThreeElementArrayBy4Places()
    {
        final int expected[] = { 3, 1, 2 };

        final int[] result = cyclicRotation.solution( THREE_ELEMENT_ARRAY, 4 );
        Assert.assertArrayEquals( expected, result );
    }
}
