/*
 * Copyright 2019 Applied Card Technologies Ltd
 */
package net.beyondcoding.codingproblems.net.beyondcoding.codility;

/**
 * @author mikej
 */
public class CyclicRotation
{
    public int[] solution( int[] A, int K )
    {
        // Empty array or
        // Rotation will put array back in the same order
        if ( A.length == 0 || K % A.length == 0 )
        {
            return A;
        }

        final int[] shiftedArray = new int[ A.length ];

        // Remove multiple full rotations, as this is wasted effort
        final int noOfPlacesToShift = K % A.length;

        int newIndex;
        for ( int i = 0; i < A.length; i++ )
        {
            newIndex = i + noOfPlacesToShift;

            if ( newIndex > A.length - 1 )
            {
                newIndex -= A.length;
            }

            shiftedArray[ newIndex ] = A[ i ];
        }

        return shiftedArray;
    }
}
