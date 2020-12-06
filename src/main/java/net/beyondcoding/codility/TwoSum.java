package net.beyondcoding.codility;

import java.util.Map;
import java.util.HashMap;

/**
 * Find the index of 2 numbers in a given array that add upto the target value.
 */
public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        final Map<Integer, Integer> numbers = new HashMap<>();
        for( int i = 0; i < nums.length; i++ )
        {
            numbers.put( nums[ i ], i );
        }

        for( int i = 0; i < nums.length; i++ )
        {
            int complement = target - nums[i];

            if( numbers.containsKey(complement ) && numbers.get( complement ) != i )
            {
                return new int[] { i, numbers.get( complement ) };
            }
        }
        return null;
    }
}
