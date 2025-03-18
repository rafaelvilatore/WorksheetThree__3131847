package giffith;


//Abstract class defining a Shape
public abstract class Shape {
 private String name; // Stores shape name

 // Constructor to initialize name
 public Shape(String name) {
     this.name = name;
 }

 // Getter and setter for name
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 // Abstract methods to be implemented by subclasses
 public abstract double area();
 public abstract double perimeter();

 // Returns the shape's name
 @Override
 public String toString() {
     return name;
 }
}