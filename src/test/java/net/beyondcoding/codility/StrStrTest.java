package net.beyondcoding.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrStrTest
{
    @Test
    public void test1()
    {
        StrStr strStr = new StrStr();

        assertEquals( 0, strStr.strStr("", "" ) );
    }

    @Test
    public void test2()
    {
        StrStr strStr = new StrStr();

        assertEquals( -1, strStr.strStr("aaaaa", "bba" ) );
    }

    @Test
    public void test3()
    {
        StrStr strStr = new StrStr();

        assertEquals( 2, strStr.strStr("hello", "ll" ) );
    }

    @Test
    public void test4()
    {
        StrStr strStr = new StrStr();

        assertEquals( 4, strStr.strStr("heloll", "ll" ) );
    }

    @Test
    public void test5()
    {
        StrStr strStr = new StrStr();

        assertEquals( 0, strStr.strStr("a", "" ) );
    }

    @Test
    public void test6()
    {
        StrStr strStr = new StrStr();

        assertEquals( 4, strStr.strStr("mississippi", "issip" ) );
    }

    @Test
    public void test7()
    {
        StrStr strStr = new StrStr();

        assertEquals( -1, strStr.strStr("aaa", "aaaa" ) );
    }

    @Test
    public void test8()
    {
        StrStr strStr = new StrStr();
        assertEquals( 6, strStr.strStr("bbbbababbbaabbba", "abb" ) );
    }

    @Test
    public void test9()
    {
        StrStr strStr = new StrStr();
        assertEquals( 6, strStr.strStr("zxcvbnabbppppppp", "abb" ) );
    }

}