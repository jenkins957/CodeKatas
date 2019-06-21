package net.beyondcoding.codility;

import java.util.Arrays;

/**
 * @author mikej
 */
public class PermMissingElem
{
    public int solution( int[] A )
    {
        if ( A.length == 0 )
        {
            return 1;
        }

        final int[] tempArray = Arrays.copyOf( A, A.length );
        Arrays.sort( tempArray );

        final int startInteger = 1;
        int nextInteger = startInteger;

        for ( int i = 0; i < tempArray.length; i++ )
        {
            if ( tempArray[ i ] != nextInteger++ )
            {
                return nextInteger - 1;
            }
        }

        // Check the last expected integer
        final int endInteger = startInteger + A.length;
        if ( tempArray[ tempArray.length - 1 ] != endInteger )
        {
            return endInteger;
        }

        return -1;
    }
}
