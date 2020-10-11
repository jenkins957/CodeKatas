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

    // Support brackets, opening and closing
    // ensure open & closing characters are at same index in corresponding arrays
    private static final List<Character> OPENING_BRACKETS = Arrays.asList( '(', '[', '{' );
    private static final List<Character> CLOSING_BRACKETS = Arrays.asList( ')', ']', '}' );

    public int solution(final String brackets )
    {
        for( char nextCharacter : brackets.toCharArray() )
        {
            if( OPENING_BRACKETS.contains( nextCharacter ) )
            {
                openingCharacters.push( nextCharacter );
            }
            else if ( CLOSING_BRACKETS.contains( nextCharacter ) )
            {
                if( openingCharacters.isEmpty() )
                {
                    return NOT_VALID;
                }

                char openingChar = openingCharacters.pop();

                if( !isClosingCharacter( openingChar, nextCharacter ) )
                {
                    return NOT_VALID;
                }
            }
        }

        return openingCharacters.isEmpty() ? VALID : NOT_VALID;
    }

    private static boolean isClosingCharacter( char openingChar, char closingChar )
    {
        final int indexOpening = OPENING_BRACKETS.indexOf( openingChar );
        final int indexClosing = CLOSING_BRACKETS.indexOf( closingChar );

        return indexOpening == indexClosing;
    }
}
