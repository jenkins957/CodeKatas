package net.beyondcoding.codility;

import java.util.HashMap;
import java.util.Map;

public class OddElement
{
    public static int sumOddElements( int[] A )
    {
        final Map<Integer, Integer> elements = new HashMap<>();

        for( int i : A )
        {
            if( elements.containsKey( i ) )
            {
                elements.put( i, elements.get( i ) + 1 );
            }
            else
            {
                elements.put( i, 1 );
            }
        }

        // can we dtop tjhis loop?

        for ( Map.Entry<Integer, Integer> entry : elements.entrySet())
        {
            if( entry.getValue() % 2 != 0 )
            {
                return entry.getKey();
            }
        }

        return -1;
    }
}
