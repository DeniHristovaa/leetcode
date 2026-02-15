package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdjacentElementsInCircleTest {
    @Test
    public void doneTask(){
        int[] array = {1, 2, 4};
        var element = new AdjacentElementsInCircle();
        assertEquals(3, element.maximumDifference(array));
    }
}
