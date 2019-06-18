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
public class FrogJmpTest
{
    private FrogJmp frogJmp;

    @Before
    public void setup()
    {
        frogJmp = new FrogJmp();
    }

    @Test
    public void shouldCalculate1Jump()
    {
        int startPosition = 0;
        int endPosition = 10;
        int jmpDistance = 10;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 1, result );
    }

    @Test
    public void shouldCalculate2Jumps()
    {
        int startPosition = 0;
        int endPosition = 20;
        int jmpDistance = 10;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 2, result );
    }

    @Test
    public void shouldCalculate2JumpsFromAnOffsetStartingPosition()
    {
        int startPosition = 2;
        int endPosition = 17;
        int jmpDistance = 5;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 3, result );
    }

    @Test
    public void shouldCalculate2JumpsWhenExceedsDestination()
    {
        int startPosition = 0;
        int endPosition = 20;
        int jmpDistance = 11;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 2, result );
    }

    @Test
    public void shouldCalculate10JumpsWhenExceedsDestination()
    {
        int startPosition = 0;
        int endPosition = 100;
        int jmpDistance = 11;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 10, result );
    }

    @Test
    public void shouldCalculate200JumpsAtIncrementsOf1()
    {
        int startPosition = 100;
        int endPosition = 300;
        int jmpDistance = 1;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 200, result );
    }

    @Test
    public void shouldCalculate1Jump_largeValues()
    {
        int startPosition = 250;
        int endPosition = 120_0000;
        int jmpDistance = 500_0000;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 1, result );
    }

    @Test
    public void shouldCalculate0JumpsWhenAlreadyAtDestination()
    {
        int startPosition = 30;
        int endPosition = 30;
        int jmpDistance = 10;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 0, result );
    }

    @Test
    public void shouldCalculate0JumpsWhenAlreadyBeyondDestination()
    {
        int startPosition = 30;
        int endPosition = 15;
        int jmpDistance = 10;

        final int result = frogJmp.solution( startPosition, endPosition, jmpDistance );
        assertEquals( 0, result );
    }
}
