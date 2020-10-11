package net.beyondcoding.codility;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 */
public class Brackets
{
    private static final int VALID = 1;
    private static final int NOT_VALID = 0;

    private Stack<Character> openingCharacters = new Stack<>();

    // Supported brackets. Ensure open & closing characters are at same index in corresponding arrays
    private static final List<Character> OPENING_BRACKETS = Arrays.asList( '(', '[', '{' );
    private static final List<Character> CLOSING_BRACKETS = Arrays.asList( ')', ']', '}' );

    public int solution( final String brackets )
    {
        for( final char nextCharacter : brackets.toCharArray() )
        {
            if( OPENING_BRACKETS.contains( nextCharacter ) )
            {
                openingCharacters.push( nextCharacter );
            }
            else if ( CLOSING_BRACKETS.contains( nextCharacter ) )
            {
                if( openingCharacters.isEmpty() || !isClosingCharacter( openingCharacters.pop(), nextCharacter ) )
                {
                    return NOT_VALID;
                }
            }
        }

        return openingCharacters.isEmpty() ? VALID : NOT_VALID;
    }

    private static boolean isClosingCharacter( char openingChar, char closingChar )
    {
        return OPENING_BRACKETS.indexOf( openingChar ) == CLOSING_BRACKETS.indexOf( closingChar );
    }
}
