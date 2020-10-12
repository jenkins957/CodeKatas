package net.beyondcoding.codility;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * @author mikej
 */
public class CyclicRotation
{
    public int[] solution( int[] A, int K )
    {
        int rotatedArray[] = new int[A.length];

        if( A.length <= 1 )
        {
            return A;
        }

        // Remove multiple full rotations, to get the true offset
        int offset = K % A.length;

        if( offset == 0 )
        {
            // nothing has changed!
            return A;
        }

        for( int i = 0; i < A.length; i++ )
        {
            final int currentElement = A[i];
            int newPosition = i + offset;
            if( newPosition > A.length - 1 )
            {
                newPosition = newPosition - A.length;
            }
            rotatedArray[newPosition] = currentElement;
        }

        // return a copy of the array
        return rotatedArray;
    }
}
