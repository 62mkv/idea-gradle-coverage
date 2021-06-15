package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    private final Sample sut = new Sample();
    @Test
    void testSomeCase() {
        assertEquals(1, sut.someMath(1, 2));
    }

}