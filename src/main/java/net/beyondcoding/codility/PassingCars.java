package net.beyondcoding.codility;

/**
 * https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */
public class PassingCars
{
    private static final int MAX_PAIRS = 1_000_000_000;
    private static final int DRIVING_EAST = 0;
    private static final int DRIVING_WEST = 1;

    public int solution( int[] A )
    {
        long pairs = 0;
        int westBound = 0;

        for ( int i = A.length - 1; i >= 0; i-- )
        {
            if( A[i] == DRIVING_WEST )
            {
                westBound++;
            }
            else if ( A[ i ] == DRIVING_EAST )
            {
                pairs += westBound;
            }
        }

        if ( pairs > MAX_PAIRS )
        {
            pairs = -1;
        }

        return ( int ) pairs;
    }
}