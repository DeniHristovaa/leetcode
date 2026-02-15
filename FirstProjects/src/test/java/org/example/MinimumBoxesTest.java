package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MinimumBoxesTest {
    @Test
    void sixApples(){
        var minimumBoxes = new MinimumBoxes();
        int result = minimumBoxes.minimumBoxes(
                new int[]{1, 2, 3},
                new int[]{4, 3, 1, 5, 2}
        );
        assertEquals(2, result);
    }
}
