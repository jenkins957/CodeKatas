package net.beyondcoding.codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap
{
    public int solutionRegex( int N )
    {
        final Pattern p = Pattern.compile( "(?=(1(0+)1))" );

        final Matcher m = p.matcher( Integer.toBinaryString( N ) );

        int longestGap = 0;

        while ( m.find() )
        {
            final String gap = m.group( 2 );
            if ( gap.length() > longestGap )
            {
                longestGap = gap.length();
            }
        }

        return longestGap;
    }

    public int solutionBit( int N )
    {
        int longestGap = 0;
        int currentGap = 0;
        boolean inGap = false;

        for ( int i = 0; i < 32; i++ )
        {
            boolean boundary = false;

            if ( ( N & ( 1 << i ) ) != 0 )
            {
                boundary = true;
            }

            if ( boundary )
            {
                if ( inGap )
                {
                    longestGap = Math.max( currentGap, longestGap );
                    currentGap = 0;
                }
                else
                {
                    inGap = true;
                }
            }
            else if ( inGap )
            {
                currentGap++;
            }
        }

        return longestGap;
    }

    public int solutionLoop( int N )
    {
        final String binaryString = Integer.toBinaryString( N );

        int longestGap = 0;
        boolean inGap = false;
        int currentGap = 0;

        for ( final char c : binaryString.toCharArray() )
        {
            if ( c == '1' && !inGap )
            {
                inGap = true;
            }
            else if ( c == '0' && inGap )
            {
                currentGap++;
            }
            else if ( c == '1' )
            {
                longestGap = Math.max( longestGap, currentGap );
                currentGap = 0;
            }
        }

        return longestGap;
    }
}
