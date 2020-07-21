package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class TapeEquilibriumTest
{
    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setup()
    {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void shouldFindLowestDifferenceOf5WithTwoDigits()
    {
        int[] array = new int[]{ 8, 3 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 5, result );
    }

    @Test
    public void shouldFindLowestDifferenceOf5WithTwoDigitsInReverseOrder()
    {
        int[] array = new int[]{ 3, 8 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 5, result );
    }

    @Test
    public void shouldFindLowestDifference()
    {
        int[] array = new int[]{ 3, 1, 2, 4, 3 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 1, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithSingleDigits()
    {
        int[] array = new int[]{ 4 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 4, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithTwoDigits()
    {
        int[] array = new int[]{ 3,4 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 1, result );

        array = new int[]{ 1, 1 };

        tapeEquilibrium = new TapeEquilibrium();
        result = tapeEquilibrium.solution( array );

        assertEquals( 0, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithThreeDigits()
    {
        int[] array = new int[]{ 3, 1, 1 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 1, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithFiveDigits()
    {
        int[] array = new int[]{ 3, 1, 2, 4, 3 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 1, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithFiveDigits_2()
    {
        int[] array = new int[]{ 1, 2, 3, 4, 2 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 0, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithFOnePositiveAndOneNegativeDigit()
    {
        int[] array = new int[]{ -1000, 1000 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 2000, result );
    }

    @Test
    public void shouldFindLowestDifferenceWithFOnePositiveAndOneNegativeDigits()
    {
        int[] array = new int[]{ -2, -3, -4, -1 };

        int result = tapeEquilibrium.solution( array );

        assertEquals( 0, result );
    }

    @Test
    // Performance test. Codility tests time out of 6 seconds.
    public void shouldBeUnderTimelimitOf6SecondsForlargeArray()
    {
        final int arraySize = 100_000;
        int[] array = new int[arraySize];

        // Generate a rather large array with
        for (int i = 0; i < arraySize; i++ )
        {
            array[i] = i;
        }

        final long startMs = System.currentTimeMillis();
        tapeEquilibrium.solution( array );
        final long endMs = System.currentTimeMillis();

        final long timeTaken = endMs - startMs;

        System.out.println( "Time taken ms: " + timeTaken );

        assertTrue( timeTaken < 6_000 );
    }
}
