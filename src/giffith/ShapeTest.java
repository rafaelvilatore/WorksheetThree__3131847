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

    // --- TEST RHOMBUS CLASS ---
    @Test
    void testRhombus() {
        Rhombus r = new Rhombus("Rhombus", 5, 6);

        double expectedArea = (5 * 6) / 2;
        double side = Math.sqrt(Math.pow(5.0 / 2, 2) + Math.pow(6.0 / 2, 2));
        double expectedPerimeter = 4 * side;

        System.out.println("Expected Perimeter: " + expectedPerimeter);
        System.out.println("Actual Perimeter: " + r.perimeter());

        assertEquals(expectedArea, r.area(), EPSILON, "Rhombus area mismatch");
        assertEquals(expectedPerimeter, r.perimeter(), EPSILON, "Rhombus perimeter mismatch");
    }

    // --- TEST RIGHT-ANGLED TRIANGLE CLASS ---
    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);

        double expectedArea = (3 * 4) / 2;
        double hypotenuse = Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
        double expectedPerimeter = 3 + 4 + hypotenuse;

        System.out.println("Expected Triangle Perimeter: " + expectedPerimeter);
        System.out.println("Actual Triangle Perimeter: " + t.perimeter());

        assertEquals(expectedArea, t.area(), EPSILON, "Triangle area mismatch");
        assertEquals(expectedPerimeter, t.perimeter(), EPSILON, "Triangle perimeter mismatch");
    }

    // --- INTEGRATION TEST FOR ALL SHAPES ---
    @Test
    void integrationTest() {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add instances of each shape
        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 4.0));

        shapes.add(new Rhombus("Rhombus", 5, 6));
        shapes.add(new Rhombus("Rhombus", 7, 8));

        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        for (Shape s : shapes) {
            System.out.println("Testing " + s.toString());

            // Ensure area and perimeter are positive
            assertTrue(s.area() > 0, "Area should be positive");
            assertTrue(s.perimeter() > 0, "Perimeter should be positive");

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                double expectedArea = Math.PI * c.getRadius() * c.getRadius();
                double expectedPerimeter = 2 * Math.PI * c.getRadius();
                assertEquals(expectedArea, s.area(), EPSILON, "Circle area mismatch");
                assertEquals(expectedPerimeter, s.perimeter(), EPSILON, "Circle perimeter mismatch");
            }

            if (s instanceof Rhombus) {
                Rhombus r = (Rhombus) s;
                double expectedArea = (r.getDiagonal1() * r.getDiagonal2()) / 2;
                double side = Math.sqrt((r.getDiagonal1() * r.getDiagonal1() + r.getDiagonal2() * r.getDiagonal2()) / 4);
                double expectedPerimeter = 4 * side;
                assertEquals(expectedArea, s.area(), EPSILON, "Rhombus area mismatch");
                assertEquals(expectedPerimeter, s.perimeter(), EPSILON, "Rhombus perimeter mismatch");
            }

            if (s instanceof RightAngledTriangle) {
                RightAngledTriangle t = (RightAngledTriangle) s;
                double expectedArea = (t.getBase() * t.getHeight()) / 2;
                double hypotenuse = Math.sqrt(t.getBase() * t.getBase() + t.getHeight() * t.getHeight());
                double expectedPerimeter = t.getBase() + t.getHeight() + hypotenuse;
                assertEquals(expectedArea, s.area(), EPSILON, "Triangle area mismatch");
                assertEquals(expectedPerimeter, s.perimeter(), EPSILON, "Triangle perimeter mismatch");
            }
        }
    }
}