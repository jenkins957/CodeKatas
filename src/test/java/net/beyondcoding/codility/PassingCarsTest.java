package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class PassingCarsTest
{
    /*
        A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars
         on a road.

        Array A contains only 0s and/or 1s:

        0 represents a car traveling east,
        1 represents a car traveling west.
        The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is
        traveling to the east and Q is traveling to the west.

        For example, consider array A such that:

          A[0] = 0
          A[1] = 1
          A[2] = 0
          A[3] = 1
          A[4] = 1
        We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

        Write a function:

        class Solution { public int solution(int[] A); }
        that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

        The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

        For example, given:

          A[0] = 0
          A[1] = 1
          A[2] = 0
          A[3] = 1
          A[4] = 1
        the function should return 5, as explained above.
     */

    private PassingCars passingCars;

    @Before
    public void setup()
    {
        passingCars = new PassingCars();
    }

    @Test
    public void shouldCountPairsOfPassingCars()
    {
        assertEquals( 5, passingCars.solution( new int[]{ 0, 1, 0, 1, 1} ) );
    }

    @Test
    public void shouldCountPairsOfPassingCarsFor1Pair()
    {
        assertEquals( 1, passingCars.solution( new int[]{ 0, 1 } ) );
    }

    @Test
    public void shouldCountPairsOfPassingCarsFor3Pairs()
    {
        assertEquals( 3, passingCars.solution( new int[]{ 0, 1, 0, 1 } ) );
    }

    @Test
    public void shouldCountPairsOfPassingCarsFor0Pairs()
    {
        assertEquals( 0, passingCars.solution( new int[]{ 0 } ) );
        assertEquals( 0, passingCars.solution( new int[]{ 1 } ) );
        assertEquals( 0, passingCars.solution( new int[]{ 0, 0 } ) );
        assertEquals( 0, passingCars.solution( new int[]{ 1, 1 } ) );
    }

    @Test
    public void shouldCountPairsOfPassingCarsFor0PairsWhenTravellingInOppositeDirection()
    {
        assertEquals( 0, passingCars.solution( new int[]{ 1, 0 } ) );
    }
}
