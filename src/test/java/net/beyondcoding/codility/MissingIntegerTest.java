package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class MissingIntegerTest
{
    private MissingInteger missingInteger;

    @Before
    public void setup()
    {
        missingInteger = new MissingInteger();
    }

    @Test
    public void shouldFindLowestMissingIntegerInList()
    {
        assertEquals( 5, missingInteger.solution( new int[]{ 1, 3, 6, 4, 1, 2 } ) );
        assertEquals( 4, missingInteger.solution( new int[]{ 1, 2, 3 } ) );
        assertEquals( 1, missingInteger.solution( new int[]{ -1, -3 } ) );
    }
}
