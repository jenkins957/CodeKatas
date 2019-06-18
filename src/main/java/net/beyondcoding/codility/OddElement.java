package net.beyondcoding.codingproblems.net.beyondcoding.codility;

import java.util.HashMap;
import java.util.Map;

public class OddElement
{
    public static int sumOddElements(int[] A)
    {
        int value = 0;
        Map<Integer,Integer> pairs = new HashMap<>();

        for( int i = 0; i < A.length; i++ )
        {
            int count = 1;

            if( pairs.containsKey(A[i]))
            {
                count = pairs.get(A[i]) + 1;
            }

            pairs.put(A[i], count);
        }

        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if( count % 2 != 0 )
            {
                value += key;
            }
        }

        return value;
    }
}
