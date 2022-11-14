package task4_1;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    
    public String toString() {
        return super.toString();
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle () {

    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

class Rectangle extends Shape {
    protected double width, length;

    public Rectangle () {

    }

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (this.length + this.width);
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

class Square extends Rectangle {
    protected double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
        //TODO Auto-generated constructor stub
    }

    public Square(double side, String color, boolean filled, double width, double length) {
        super(width, length, color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSlide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}