package giffith;


//Circle class extending Shape
public class Circle extends Shape {
 private double radius; // Stores circle's radius

 // Constructor to initialize name and radius
 public Circle(String name, double radius) {
     super(name);
     this.radius = radius;
 }

 // Getters and setters for radius
 public double getRadius() { return radius; }
 public void setRadius(double radius) { this.radius = radius; }

 // Computes area of the circle (πr²)
 @Override
 public double area() {
     return Math.PI * radius * radius;
 }

 // Computes perimeter (circumference) of the circle (2πr)
 @Override
 public double perimeter() {
     return 2 * Math.PI * radius;
 }

 // Returns circle details
 @Override
 public String toString() {
     return super.toString() + ": radius = " + radius;
 }
}
