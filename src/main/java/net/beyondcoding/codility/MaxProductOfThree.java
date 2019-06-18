package net.beyondcoding.codingproblems.net.beyondcoding.codility;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 *
 * For example, array A such that:
 *
 *   A[0] = -3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = -2
 *   A[4] = 5
 *   A[5] = 6
 * contains the following example triplets:
 *
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 * Goal is to find the maximal product of any triplet.
 */
public class MaxProductOfThree
{
    public static int maxProductOfThree(int[] A)
    {
        Arrays.sort(A);
        final int length = A.length;
        final int right = A[ length - 1 ] * A[ length - 2 ] * A[ length - 3 ];
        final int left = A[ length - 1 ] * A[ 0 ] * A[ 1 ];

        return Math.max( right, left );
    }
}
