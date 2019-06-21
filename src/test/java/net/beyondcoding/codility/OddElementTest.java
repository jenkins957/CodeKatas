package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddElementTest
{
    @Test
    public void shouldRotateArrayToRightBy1()
    {
        int array[] = {1,1,1,1,3,3,3};
        assertEquals( 3, OddElement.sumOddElements(array) );
    }
}
