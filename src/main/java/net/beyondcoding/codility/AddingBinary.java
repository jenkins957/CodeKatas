package net.beyondcoding.codility;

public class AddingBinary
{
    public String addBinary( final String a, final String b)
    {
        final StringBuffer sb = new StringBuffer();

        int carry = 0;
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;

        while( aLen >= 0 || bLen >= 0 )
        {
            int op1 = aLen >= 0 ? a.charAt( aLen-- ) - '0' : 0;
            int op2 = bLen >= 0 ? b.charAt( bLen-- ) - '0' : 0;

            int sum = op1 + op2 + carry;
            carry = sum / 2;
            sum = sum % 2;

            sb.append( sum );
        }

        if( carry == 1 )
        {
            sb.append( "1" );
        }

        return sb.reverse().toString();
    }
}
