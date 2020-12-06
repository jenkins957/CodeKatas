package net.beyondcoding.codility;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalsTriangleTest
{
    private PascalsTriangle pascalsTriangle;

    @Before
    public void setup()
    {
        pascalsTriangle = new PascalsTriangle();
    }

    @Test
    public void shouldGenerateEmptyTriangle()
    {
        assertTrue( "Number of rows", pascalsTriangle.generate( 0 ).isEmpty() );
    }

    @Test
    public void shouldGenerateTriangleWithSingleRow()
    {
        final List<List<Integer>> triangle = pascalsTriangle.generate(1 );

        assertEquals( "Number of rows", 1, triangle.size() );
        assertEquals( 1, triangle.get( 0 ).size() );
        assertEquals( 1, triangle.get( 0 ).get( 0 ).intValue() );
    }

    @Test
    public void shouldGenerateTriangleWith2Rows()
    {
        final List<List<Integer>> triangle = pascalsTriangle.generate(2 );

        assertEquals( "Number of rows",2, triangle.size() );

        // Row 1
        assertEquals( 1, triangle.get( 0 ).size() );
        assertEquals( 1, triangle.get( 0 ).get( 0 ).intValue() );

        // Row 2
        assertEquals( 2, triangle.get( 1 ).size() );
        assertEquals( 1, triangle.get( 1 ).get( 0 ).intValue() );
        assertEquals( 1, triangle.get( 1 ).get( 1 ).intValue() );
    }

    @Test
    public void shouldGenerateTriangleWith3Rows()
    {
        final List<List<Integer>> triangle = pascalsTriangle.generate(3 );

        assertEquals(  "Number of rows", 3, triangle.size() );

        int rowIndex = 0;

        // Row 1
        assertEquals( 1, triangle.get( rowIndex ).size() );
        assertEquals( 1, triangle.get( rowIndex ).get( 0 ).intValue() );
        rowIndex++;

        // Row 2
        assertEquals( 2, triangle.get( rowIndex ).size() );

        // Numbers in row
        assertEquals( 1, triangle.get( rowIndex ).get( 0 ).intValue() );
        assertEquals( 1, triangle.get( rowIndex ).get( 1 ).intValue() );
        rowIndex++;

        // Row 3
        assertEquals( 3, triangle.get( rowIndex ).size() );

        // Numbers in row
        assertEquals( 1, triangle.get( rowIndex ).get( 0 ).intValue() );
        assertEquals( 2, triangle.get( rowIndex ).get( 1 ).intValue() );
        assertEquals( 1, triangle.get( rowIndex ).get( 2 ).intValue() );
        rowIndex++;
    }
}