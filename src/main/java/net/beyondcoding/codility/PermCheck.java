/*
 * Copyright 2019 Applied Card Technologies Ltd
 */
package net.beyondcoding.codility;

import java.util.Arrays;

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
        else if( A.length == 1 )
        {
            return 1;
        }

        // Sort a copy of the array to avoid side effects
        final int sortedArray[] = Arrays.copyOf( A, A.length );
        Arrays.sort( sortedArray );

        int expectedValue = 0;
        for ( int i = 0; i < sortedArray.length; i++ )
        {
            if ( sortedArray[ i ] != expectedValue + 1 )
            {
                return 0;
            }

            expectedValue++;
        }

        return 1;
    }
}
