package net.beyondcoding.codingproblems.net.beyondcoding.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddElementTest
{
    @Test
    public void shouldRotateArrayToRightBy1()
    {
        int array[] = {1,1,1,1,3,3,3};
        assertEquals( 3, OddElement.sumOddElements(array) );
    }
}
