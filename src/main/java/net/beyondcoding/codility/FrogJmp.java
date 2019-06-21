package net.beyondcoding.codility;

/**
 * @author mikej
 */
public class FrogJmp
{
    public int solution( int X, int Y, int D )
    {
        final int distanceToJump = Y - X;

        if ( distanceToJump < 0 )
        {
            return 0;
        }

        return (int) Math.ceil( (double) distanceToJump / D );
    }
}
