package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {
    @Test
    public void comparingArrays(){
        int[] currentArray = MergeSortedArray.finalNumsFromArrays(new int[]{1, 2, 3, 4, 5, 6}, 3);
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, currentArray);
    }
}
