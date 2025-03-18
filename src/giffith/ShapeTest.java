package giffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private static final double EPSILON = 0; // Use epsilon of 0 for comparisons

    @Test
    void testCircle() {
        Circle c = new Circle("Circle", 3.5);
        assertEquals(38.4845, c.area(), EPSILON);
        assertEquals(21.9911, c.perimeter(), EPSILON);
        assertEquals("Circle: radius = 3.5", c.toString());
    }

    @Test
    void testRhombus() {
        Rhombus r = new Rhombus("Rhombus", 5, 6);
        assertEquals(15, r.area(), EPSILON);
        assertEquals(22, r.perimeter(), EPSILON);
        assertEquals("Rhombus: diagonal1 = 5, diagonal2 = 6", r.toString());
    }

    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(6, t.area(), EPSILON);
        assertEquals(12, t.perimeter(), EPSILON);
        assertEquals("RightAngledTriangle: base = 3, height = 4", t.toString());
    }

    @Test
    void integrationTest() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 4.0));
        shapes.add(new Rhombus("Rhombus", 5, 6));
        shapes.add(new Rhombus("Rhombus", 7, 8));
        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        for (Shape s : shapes) {
            assertNotNull(s.area());
            assertNotNull(s.perimeter());
        }
    }
}