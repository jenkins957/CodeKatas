package net.beyondcoding.codility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle
{
    public List<List<Integer>> generate( int numRows )
    {
        if( numRows == 0 )
        {
            return Collections.emptyList();
        }

        final List<List<Integer>> triangle = new ArrayList<>();

        // Add single row to eliminate issue of looking up the previous row
        triangle.add( Arrays.asList( 1 ) );

        for( int i = 1; i < numRows; i++ )
        {
            final List<Integer> previousRow = triangle.get( i - 1);

            final List<Integer> row = new ArrayList<>();
            // 1st and last elements always a 1, calculate everything in between using previous row
            row.add( 1 );
            for( int j = 1; j < previousRow.size(); j++ )
            {
                row.add( previousRow.get( j ) + previousRow.get( j - 1 ) );
            }

            row.add( 1 );
            triangle.add( row );
        }

        return triangle;
    }
}
