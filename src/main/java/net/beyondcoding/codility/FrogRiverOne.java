package net.beyondcoding.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne
{
    public int solution( int X, int[] A )
    {
        // at what point are all the digits 1 to X found in A?
        final Set valuesFound = new HashSet();

        for( int i = 0; i < A.length; i++ )
        {
            valuesFound.add( A[i] );

            if( valuesFound.size() == X )
            {
                return i;
            }
        }

        return -1;
    }
}
