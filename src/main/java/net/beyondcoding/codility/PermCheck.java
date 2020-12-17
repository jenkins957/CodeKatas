package net.beyondcoding.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mikej
 */
public class PermCheck
{
    /**
     * A permutation is a sequence containing each element from 1 to N once, and only once.
     *
     * @param A
     * @return 1 if Array A is a permutation, 0 if not
     */
    public int solution( int[] A )
    {
        // Early out to improve performance
        if ( A.length == 0 )
        {
            return 0;
        }
        final Set<Integer> countOfElements = new HashSet<>();

        // elements from 1 to n once only
        for ( int i = 0; i < A.length; i++ )
        {
            if ( countOfElements.contains( A[ i ] ) )
            {
                return 0;
            }
            countOfElements.add( A[ i ] );
        }

        for ( int i = 1; i <= A.length; i++ )
        {
            if ( !countOfElements.contains( i ) )
            {
                return 0;
            }
        }

        return 1;
    }
}
