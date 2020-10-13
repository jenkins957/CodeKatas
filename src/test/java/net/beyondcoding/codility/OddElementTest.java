package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddElementTest
{
    @Test
    public void shouldReturnValueOfUnpairedElement_nopairs()
    {
        final int array1[] = { 1 };
        assertEquals( 1, OddElement.sumOddElements( array1 ) );

        final int array2[] = { 99 };
        assertEquals( 99, OddElement.sumOddElements( array2 ) );
    }

    @Test
    public void shouldReturnValueOfUnpairedElement_one_pair()
    {
        final int array1[] = { 1, 1, 2 };
        assertEquals( 2, OddElement.sumOddElements( array1 ) );
    }

    @Test
    public void shouldReturnValueOfUnpairedElement_two_pair()
    {
        final int array1[] = { 1, 1, 2, 3, 3 };
        assertEquals( 2, OddElement.sumOddElements( array1 ) );
    }
}
