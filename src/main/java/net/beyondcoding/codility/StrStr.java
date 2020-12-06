package net.beyondcoding.codility;

public class StrStr
{
    public int strStr(String haystack, String needle)
    {
        if ( haystack.isEmpty() && needle.isEmpty() || needle.isEmpty() )
        {
            return 0;
        }
        if( needle.length() > haystack.length() )
        {
            return -1;
        }

        // For each character in haystack start comparing needle
        for( int i = 0; i < haystack.length() - needle.length() + 1; i++ )
        {
            int matchingChars = 0;

            for ( int j = 0; j < needle.length(); j++ )
            {
                if ( haystack.charAt( j + i ) == needle.charAt( j ) )
                {
                    matchingChars++;

                    // We have a match!
                    if( matchingChars == needle.length() )
                    {
                        return i;
                    }
                }
                else
                {
                    matchingChars = 0;
                }
            }
        }

        return -1;
    }
}
