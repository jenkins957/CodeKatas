package net.beyondcoding.codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctTest
{
    @Test
    public void shouldContainASingleDistictElementInArrayOfOneElement()
    {
        int elements[] = {1};

        assertEquals( 1, Distinct.noOfDistinctElements(elements));

    }

    @Test
    public void shouldContainATwoDistictElementInArrayOfTwoElement()
    {
        int elements[] = {1, 2};

        assertEquals( 2, Distinct.noOfDistinctElements(elements));
    }

    @Test
    public void shouldContainAOneDistictElementInArrayOfTwoElement()
    {
        int elements[] = {1, 1};

        assertEquals( 1, Distinct.noOfDistinctElements(elements));
    }

    @Test
    public void shouldContainAThreeDistictElementInArray()
    {
        int elements[] = {1, 1, 2, 3, 3 ,0 ,4, 4, 9, 1};

        assertEquals( 6, Distinct.noOfDistinctElements(elements));
    }

    @Test
    public void shouldNotContainDistictElementsInEmptyArray()
    {
        int elements[] = {};

        assertEquals( 0, Distinct.noOfDistinctElements(elements));
    }

}
