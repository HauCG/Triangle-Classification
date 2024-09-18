package TestFile;

import org.example.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void testEquilateralTriangle() {
        assertEquals("Equilateral Triangle", Triangle.sideTriangle(3, 3, 3));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Isosceles Triangle", Triangle.sideTriangle(3, 3, 2));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Scalene Triangle", Triangle.sideTriangle(3, 4, 5));
    }

    @Test
    void testNotATriangle() {
        assertEquals("Not a triangle", Triangle.sideTriangle(1, 2, 3));
    }
}
