package giffith;

//Right-angled triangle class extending Shape
public class RightAngledTriangle extends Shape {
 private double base, height; // Base and height of the triangle

 // Constructor to initialize name, base, and height
 public RightAngledTriangle(String name, double base, double height) {
     super(name);
     this.base = base;
     this.height = height;
 }

 // Getters and setters for base and height
 public double getBase() { return base; }
 public void setBase(double base) { this.base = base; }

 public double getHeight() { return height; }
 public void setHeight(double height) { this.height = height; }

 // Computes area of the triangle (½ × base × height)
 @Override
 public double area() {
     return (base * height) / 2;
 }

 // Computes perimeter (base + height + hypotenuse)
 @Override
 public double perimeter() {
     double hypotenuse = Math.sqrt(base * base + height * height);
     return base + height + hypotenuse;
 }

 // Returns triangle details
 @Override
 public String toString() {
     return super.toString() + ": base = " + base + ", height = " + height;
 }
}
