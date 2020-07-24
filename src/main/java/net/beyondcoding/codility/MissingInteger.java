package net.beyondcoding.codility;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
public class MissingInteger
{
    public int solution( int[] A )
    {
        Arrays.sort( A );

        int nextIntToFind = 1;

        for( int n : A )
        {
            if( n == nextIntToFind )
            {
                nextIntToFind++;
            }
        }

        return nextIntToFind;
    }
}
