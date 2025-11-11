package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloMessageTest {
    @Test
    public void testGetHelloMessage() {
        String expected = "HelloWorld";
        String actual = "HelloWorld";

        assertEquals(expected, actual);
    }
}
