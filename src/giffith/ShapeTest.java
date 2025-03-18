package giffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class ShapeTest {
	private static final double EPSILON = 1e-6; // Small tolerance for floating-point errors
	
	// --- TEST CIRCLE CLASS ---
    @Test
    void testCircle() {
        Circle c = new Circle("Circle", 3.5);

        double expectedArea = Math.PI * c.getRadius() * c.getRadius();
        double expectedPerimeter = 2 * Math.PI * c.getRadius();

        assertEquals(expectedArea, c.area(), EPSILON, "Circle area mismatch");
        assertEquals(expectedPerimeter, c.perimeter(), EPSILON, "Circle perimeter mismatch");
        assertEquals("Circle: radius = 3.5", c.toString(), "Circle toString mismatch");
    }

    @Test
    void testRhombus() {
        Rhombus r = new Rhombus("Rhombus", 5, 6);
        assertEquals(15, r.area(), EPSILON); // ½ * 5 * 6
        assertEquals(22, r.perimeter(), EPSILON); // Approximate using Pythagorean theorem
        assertEquals("Rhombus: diagonal1 = 5, diagonal2 = 6", r.toString());
    }

    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(6, t.area(), EPSILON); // ½ * 3 * 4
        assertEquals(12, t.perimeter(), EPSILON); // 3 + 4 + 5 (hypotenuse = 5)
        assertEquals("RightAngledTriangle: base = 3, height = 4", t.toString());
    }

    @Test
    void integrationTest() {
        // Creates a list of shapes
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 4.0));
        shapes.add(new Rhombus("Rhombus", 5, 6));
        shapes.add(new Rhombus("Rhombus", 7, 8));
        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        // Loops through each shape and checks area/perimeter
        for (Shape s : shapes) {
            assertNotNull(s.area());
            assertNotNull(s.perimeter());
        }
    }
}
