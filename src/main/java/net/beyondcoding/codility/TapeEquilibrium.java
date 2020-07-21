package net.beyondcoding.codility;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
public class TapeEquilibrium
{
    public int solution( int[] A )
    {
        if ( A.length == 0 )
        {
            return 0;
        }

        if( A.length == 1 )
        {
            return A[0];
        }

        final long sum = sumArray( A );

        long leftSide = A[0];
        long rightSide = sum - A[0];
        long minimumAbsoluteDifference = Math.abs( leftSide - rightSide );

        for ( int i = 1; i < A.length - 1; i++ )
        {
            leftSide += A[i];
            rightSide -= A[i];

            int absoluteDifference = ( int ) Math.abs( leftSide - rightSide );
            if ( absoluteDifference <  minimumAbsoluteDifference )
            {
                 minimumAbsoluteDifference = absoluteDifference;
            }
        }

        return ( int )  minimumAbsoluteDifference;
    }

    private static int sumArray( final int[] array )
    {
        int sum = 0;
        for( int n : array )
        {
            sum += n;
        }

        return sum;
    }
}
