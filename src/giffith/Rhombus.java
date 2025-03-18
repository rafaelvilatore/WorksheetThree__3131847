package giffith;


//Rhombus class extending Shape
public class Rhombus extends Shape {
 private double diagonal1, diagonal2; // Diagonals of the rhombus

 // Constructor to initialize name and diagonals
 public Rhombus(String name, double diagonal1, double diagonal2) {
     super(name);
     this.diagonal1 = diagonal1;
     this.diagonal2 = diagonal2;
 }

 // Getters and setters for diagonals
 public double getDiagonal1() { return diagonal1; }
 public void setDiagonal1(double diagonal1) { this.diagonal1 = diagonal1; }

 public double getDiagonal2() { return diagonal2; }
 public void setDiagonal2(double diagonal2) { this.diagonal2 = diagonal2; }

 // Computes area of the rhombus (½ × diagonal1 × diagonal2)
 @Override
 public double area() {
     return (diagonal1 * diagonal2) / 2;
 }

 // Approximates perimeter using Pythagorean theorem
 @Override
 public double perimeter() {
     return 2 * (Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2) / 4));
 }

 // Returns rhombus details
 @Override
 public String toString() {
     return super.toString() + ": diagonal1 = " + diagonal1 + ", diagonal2 = " + diagonal2;
 }
}
