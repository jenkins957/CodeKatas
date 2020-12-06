package net.beyondcoding.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddingBinaryTest
{
    @Test
    public void addBinaryAddZeros()
    {
        final AddingBinary addingBinary = new AddingBinary();

        assertEquals( "0", addingBinary.addBinary( "0", "0" ) );
    }

    @Test
    public void addBinaryAdd1()
    {
        final AddingBinary addingBinary = new AddingBinary();

        assertEquals( "1", addingBinary.addBinary( "1", "0" ) );
    }

    @Test
    public void addBinaryAdd1_1()
    {
        final AddingBinary addingBinary = new AddingBinary();

        assertEquals( "1", addingBinary.addBinary( "0", "1" ) );
    }

    @Test
    public void addBinaryAddTwo1sWithCarry()
    {
        final AddingBinary addingBinary = new AddingBinary();

        assertEquals( "10", addingBinary.addBinary( "1", "1" ) );
    }

    @Test
    public void addBinaryAddWithMultipleCarrys()
    {
        final AddingBinary addingBinary = new AddingBinary();

        assertEquals( "11010", addingBinary.addBinary( "1101", "1101" ) );
    }

    @Test
    public void addBinaryAddWithDifferentLengthNumbers()
    {
        final AddingBinary addingBinary = new AddingBinary();

        assertEquals( "10010", addingBinary.addBinary( "101", "1101" ) );
    }
}