import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest2 extends Math{

    @Test
    void multiplyTest() {
        double a = 10;
        double b = 15;
        double product = multiply(a, b);
        assertEquals(150.0, product);
    }

    @Test
    void divideTest() {
        double a = 10;
        double b = 2;
        double quotient = divide(a, b);
        assertEquals(5.0, quotient);
    }

    @Test
    void remainderTest() {
        int a = 10;
        int b = 3;
        double remainder = remainder(a, b);
        assertEquals(1, remainder);

    }
}