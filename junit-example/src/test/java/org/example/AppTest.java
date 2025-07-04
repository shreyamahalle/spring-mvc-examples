package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    App app = new App();

    @Test
    void testAdd() {
        int result = app.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        int result = app.subtract(10, 4);
        assertEquals(6, result);
    }
}