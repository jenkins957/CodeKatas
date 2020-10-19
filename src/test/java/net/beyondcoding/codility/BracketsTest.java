package net.beyondcoding.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BracketsTest
{
    private static final int VALID = 1;
    private static final int NOT_VALID = 0;

    private Brackets brackets;

    @Before
    public void setup()
    {
        brackets = new Brackets();
    }

    @Test
    public void shouldBeValidNestingForEmptyString()
    {
        Assert.assertEquals( VALID, brackets.solution( "" ) );
    }

    @Test
    public void shouldBeValidNestingForOnePair()
    {
        Assert.assertEquals( VALID, brackets.solution( "()" ) );
        Assert.assertEquals( VALID, brackets.solution( "[]" ) );
        Assert.assertEquals( VALID, brackets.solution( "{}" ) );
    }

    @Test
    public void shouldBeValidNestingForTwoPairs()
    {
        Assert.assertEquals( VALID, brackets.solution( "(())" ) );
        Assert.assertEquals( VALID, brackets.solution( "[[]]" ) );
        Assert.assertEquals( VALID, brackets.solution( "{{}}" ) );
    }

    @Test
    public void shouldBeValidNestingForTwoPairsMixed()
    {
        Assert.assertEquals( VALID, brackets.solution( "([])" ) );
        Assert.assertEquals( VALID, brackets.solution( "[{}]" ) );
        Assert.assertEquals( VALID, brackets.solution( "{()}" ) );
    }

    @Test
    public void shouldBeValidNestingForThreePairsMixed()
    {
        Assert.assertEquals( VALID, brackets.solution( "([{}])" ) );
        Assert.assertEquals( VALID, brackets.solution( "[{()}]" ) );
        Assert.assertEquals( VALID, brackets.solution( "{([])}" ) );
    }

    @Test
    public void shouldBeValidNestingForMultipleRepeatingPairs()
    {
        Assert.assertEquals( VALID, brackets.solution( "{[((([{{}}])))]}" ) );
    }

    @Test
    public void shouldNotBeValidNestingForSingleCharacter_1()
    {
        Assert.assertEquals( NOT_VALID, brackets.solution( "(" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "[" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "{" ) );
    }

    @Test
    public void shouldNotBeValidNestingForSingleCharacterResetState()
    {
        /*
         * Tests a bug - Each test case on its own passes,
         * however when running both together, second one fails.
         * The original code failed to clear out previous state
         */
        Assert.assertEquals( NOT_VALID, brackets.solution( "((" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "))" ) );
    }

    @Test
    public void shouldNotBeValidNestingForSingleCharacter_2()
    {
        Assert.assertEquals( NOT_VALID, brackets.solution( ")" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "]" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "}" ) );
    }

    @Test
    public void shouldNotBeValidNestingForReversedPair()
    {
        Assert.assertEquals( NOT_VALID, brackets.solution( ")(" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "][" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "}{" ) );
    }

    @Test
    public void shouldNotBeValidNestingForReversedPair_2()
    {
        Assert.assertEquals( NOT_VALID, brackets.solution( "[)(]" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "{][}" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "(}{)" ) );
    }

    @Test
    public void shouldNotBeValidNestingForMissingCLosingBracket()
    {
        Assert.assertEquals( NOT_VALID, brackets.solution( "[{()}" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "[{()]" ) );
        Assert.assertEquals( NOT_VALID, brackets.solution( "[{(}]" ) );
    }
}