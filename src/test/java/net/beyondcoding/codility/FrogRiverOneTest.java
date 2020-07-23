package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class FrogRiverOneTest
{
    private FrogRiverOne frogRiverOne;

    @Before
    public void setup()
    {
        frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void shouldBeAbleToJumpAtPosition6()
    {
        // x = 5
        // [0] --> [x + 1 (6)]
        // Need to find earliest point when all positions are filled
        // [0] [] [] [] [] [] [6]
        // index 0  1  2  3  4  5  6  7
        // value 1, 3, 1, 4, 2, 3, 5, 4
        // 1 - 5 completed at index 6, so 6 returned
        final int result = frogRiverOne.solution( 5, new int[]{ 1, 3, 1, 4, 2, 3, 5, 4 } );

        assertEquals( 6, result );
    }

    @Test
    public void shouldBeAbleToJumpAtPosition6OrderedList()
    {
        // x = 5
        // [0] --> [x + 1 (6)]
        // Need to find earliest point when all positions are filled
        // [0] [] [] [] [] [] [6]
        // index 0  1  2  3  4  5  6  7
        // value 1, 2, 3, 4, 5, 6, 7, 8
        // 1 - 5 completed at index 4, so 4 returned
        final int result = frogRiverOne.solution( 5, new int[]{ 1, 2, 3, 4, 5, 6, 7, 8 } );

        assertEquals( 4, result );
    }

    @Test
    public void shouldBeAbleToJumpAtPosition7OrderedList()
    {
        final int result = frogRiverOne.solution( 8, new int[]{ 1, 2, 3, 4, 5, 6, 7, 8 } );

        assertEquals( 7, result );
    }

    @Test
    public void shouldBeAbleToJumpAtPosition1()
    {
        final int result = frogRiverOne.solution( 1, new int[]{ 1 } );

        assertEquals( 0, result );
    }

    @Test
    // Performance test. Codility tests time out of 6 seconds. Obviously hardware dependant.
    public void shouldBeUnderTimelimitOf1SecondForlargeArray()
    {
        final int arraySize = 200_000;
        int[] array = new int[ arraySize ];

        // Generate a rather large array with
        for ( int i = 0; i < arraySize; i++ )
        {
            array[ i ] = i + 1;
        }

        final long startMs = System.currentTimeMillis();
        final int result = frogRiverOne.solution( arraySize, array );
        final long endMs = System.currentTimeMillis();

        final long timeTaken = endMs - startMs;

        System.out.println( "Time taken ms: " + timeTaken );

        assertEquals( arraySize -1, result );
        assertTrue( timeTaken < 6_000 );
    }
}
