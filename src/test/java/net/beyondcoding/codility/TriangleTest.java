package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mikej
 */
public class TriangleTest
{
    /*
        https://app.codility.com/programmers/lessons/6-sorting/triangle/

        An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].

        For example, consider array A such that:
        A[0] = 10    A[1] = 2    A[2] = 5
        A[3] = 1     A[4] = 8    A[5] = 20
        Triplet (0, 2, 4) is triangular.

        Write a function:

        class Solution { public int solution(int[] A); }

        that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this
        array and returns 0 otherwise.
     */

    private Triangle triangle;

    @Before
    public void setup()
    {
        triangle = new Triangle();
    }

    @Test
    public void shouldBeTriangular()
    {
        assertTrue( Triangle.isTriangular(5, 8, 10 ) );
    }

    @Test
    public void shouldBeTriangularWhenNumbersAllEqual()
    {
        assertTrue( Triangle.isTriangular( 5, 5, 5 ) );
    }

    @Test
    public void shouldBeTriangularWhenNumbersAllEqualMaxInteger()
    {
        // Test for overflow
        assertTrue( Triangle.isTriangular( Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE ) );
    }

    @Test
    public void shouldNotBeTriangularWhenInAscendingOrder()
    {
        // A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
        assertFalse( Triangle.isTriangular( 10, 8, 5 ) );
    }

    @Test
    public void shouldNotBeTriangularForNegativeNumbers()
    {
        assertFalse( Triangle.isTriangular( -5, -8, -10 ) );
    }

    // Tests for the iterating over the array - all in one file for purpose of the test (breaking SRP)
    @Test
    public void shouldContainTriangularTripletInArray()
    {
        // 5, 8, 10 in this order is triangular
        final int array[] = { 5, 8, 10 };
        assertEquals( 1, triangle.solution( array ) );
    }

    @Test
    public void shouldContainTriangularTripletInArrayOutOfOrder()
    {
        // 5, 8, 10 in this order is triangular
        final int array[] = { 10, 5, 8 };
        assertEquals( 1, triangle.solution( array ) );
    }

    @Test
    public void shouldContainTriangularTripletInLargerArray()
    {
        // 5, 8, 10 in this order is triangular
        final int array[] = { 10, 2, 5, 1, 8, 20 };
        assertEquals( 1, triangle.solution( array ) );
    }

    @Test
    public void shouldNotContainTriangularTripletInArray()
    {
        final int array[] = { 10, 50, 5, 1 };
        assertEquals( 0, triangle.solution( array ) );
    }

    @Test
    public void shouldNotContainTriangularTripletInArrayWithDuplicateNumber()
    {
        final int array[] = { 5, 3, 3 };
        assertEquals( 1, triangle.solution( array ) );
    }

    @Test
    public void shouldNotContainTriangularTripletInEmptyArray()
    {
        final int array[] = { };
        assertEquals( 0, triangle.solution( array ) );
    }

    @Test
    public void shouldNotContainTriangularTripletIArrayWithNegativeNumbers()
    {
        final int array[] = { -3, -3, -3 };
        assertEquals( 0, triangle.solution( array ) );
    }

    @Test
    public void shouldNotContainTriangularTripletInAOneElementArray()
    {
        final int array[] = { 1 };
        assertEquals( 0, triangle.solution( array ) );
    }

    @Test
    public void shouldNotContainTriangularTripletInArrayWithThreeMaxIntegers()
    {
        final int array[] = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
        assertEquals( 1, triangle.solution( array ) );
    }
}
