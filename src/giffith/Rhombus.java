package giffith;


public class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(String name, double diagonal1, double diagonal2) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double perimeter() {
        double side = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
        return 4 * side;
    }

    @Override
    public String toString() {
        return getName() + ": diagonal1 = " + diagonal1 + ", diagonal2 = " + diagonal2;
    }
}
