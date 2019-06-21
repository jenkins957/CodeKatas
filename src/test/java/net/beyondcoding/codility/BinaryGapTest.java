package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mikej
 */
public class BinaryGapTest
{
    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testPerformance()
    {
        int n = 1073741825;
        int expectedGap = 29;

        long start = System.nanoTime();
        int gap = binaryGap.solutionRegex( n );
        assertEquals( expectedGap, gap );
        long elapsed = System.nanoTime() - start;
        System.out.println( "Regex: " + elapsed + " ns" );

        start = System.nanoTime();
        gap = binaryGap.solutionLoop( n );
        assertEquals( expectedGap, gap );
        elapsed = System.nanoTime() - start;
        System.out.println( "Loop: " + elapsed + " ns" );

        start = System.nanoTime();
        gap = binaryGap.solutionBit( n );
        assertEquals( expectedGap, gap );
        elapsed = System.nanoTime() - start;
        System.out.println( "Bit: " + elapsed + " ns" );
    }
}
