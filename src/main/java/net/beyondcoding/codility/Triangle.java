package net.beyondcoding.codility;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/triangle/
 */
public class Triangle
{
    public static boolean isTriangular( final int x, final int y, final int z )
    {
        // cast to longs to protect against overflow, as we will need to add integers at max value
        final long xl = x;
        final long yl = y;
        final long zl = z;

        boolean isTriangular = false;

        if ( xl > 0 && xl <= yl && y <= z )
        {
            isTriangular = ( xl + yl > zl ) && ( yl + zl > xl ) && ( zl + xl > yl );
        }

        return isTriangular;
    }

    public int solution( int[] A )
    {
        Arrays.sort( A );

        if ( A.length < 3 )
        {
            return 0;
        }

        int i = 0;
        while ( i + 2 < A.length )
        {
            if ( isTriangular( A[ i ], A[ i + 1 ], A[ i + 2 ] ) )
            {
                // we got one! early out
                return 1;
            }
            i++;
        }

        return 0;
    }
}
