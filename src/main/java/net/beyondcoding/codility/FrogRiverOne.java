package net.beyondcoding.codility;

import java.util.LinkedList;
import java.util.List;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne
{
    public int solution( int X, int[] A )
    {
        // at what point are all the digits 1 to X found in A?

        // Use Linked list for performance as faster at removing items than an Array List
        final List<Integer> digits = new LinkedList<>();

        for( int i = 1; i <= X; i++ )
        {
            digits.add( i );
        }

        for( int i = 0; i < A.length; i++ )
        {
            final int digit = A[i];

            digits.remove( Integer.valueOf( digit ) );

            if( digits.isEmpty() )
            {
                return i;
            }
        }

        return -1;
    }
}
