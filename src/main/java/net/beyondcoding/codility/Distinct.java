package net.beyondcoding.codingproblems.net.beyondcoding.codility;

import java.util.Map;
import java.util.HashMap;

/**
 * Given an array A consisting of N integers, returns the number of distinct values in array A.
 *
 * Assume that:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * For example, given array A consisting of six elements such that:
 *
 *  A[0] = 2    A[1] = 1    A[2] = 1
 *  A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 */
public class Distinct
{
    public static int noOfDistinctElements( int[] A )
    {
        final Map<Integer, Integer> uniqueElements = new HashMap<>();

        for( int i = 0; i < A.length; i++ )
        {
            int count = 1;

            if( uniqueElements.containsKey(A[i]))
            {
                count = uniqueElements.get(A[i]) + 1;
            }

            uniqueElements.put(A[i], count);
        }

        return uniqueElements.keySet().size();
    }
}
