import static org.junit.jupiter.api.Assertions.*;
class MathTest extends Math{

    @org.junit.jupiter.api.Test
    void addTest() {
        double a = 10;
        double b = 15;
        double sum = add(a, b);
        assertEquals(25.0, sum);
    }

    @org.junit.jupiter.api.Test
    void subtractTest() {
        double a = 15;
        double b = 10;
        double difference = subtract(a, b);
        assertEquals(5.0, difference);
    }
}