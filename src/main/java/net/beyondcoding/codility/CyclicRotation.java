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

        for( int i = 0; i < A.length; i++ )
        {
            // allocate new position, taking wrap-around into account
            rotatedArray[( i + K ) % A.length] = A[i];
        }

        return rotatedArray;
    }
}
