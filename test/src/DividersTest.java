package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DividersTest {

    @Test
    public void testPositiveNumber() {
        assertEquals(23, new Dividers().getDividersSum(10));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(0, new Dividers().getDividersSum(-15));
    }
}