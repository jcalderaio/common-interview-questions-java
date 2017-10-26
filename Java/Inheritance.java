package Java;

class Inheritance {
  protected String color;

  public Inheritance() {
    color = new String();
  }
  public Inheritance(String color) {
    this.color = new String(color);
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printInfo() {
    System.out.println(this.toString());
  }
  public String toString() {
    return "Color = " + color + "\n";
  }
}

class Circle extends Inheritance {
  private double radius;

  public Circle() {
    super();
    radius = 0.0D;
  }
  public Circle(double radius) {
    super();
    this.radius = radius;
  }
  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }
  public double calculateArea() {
    return radius * radius * Math.PI;
  }
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }
  public String toString() {
    return super.toString() +
           "Radius = " + radius + "\n";
  }
}

class Triangle extends Inheritance {
  private double base;
  private double height;

  public Triangle() {
    super();
    this.base = 0.0D;
    this.height = 0.0D;
  }
  public Triangle(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }
  public Triangle(double base, double height, String color) {
    super(color);
    this.base = base;
    this.height = height;
  }
  public double calculateArea() {
    return base * height / 2;
  }
  public double getBase() {
    return base;
  }
  public double getHeight() {
    return height;
  }
  public void setBase(double base) {
    this.base = base;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public String toString() {
    return super.toString() +
           "Base = " + base + "\n" +
           "Height = " + height + "\n";
  }
}

class Rectangle extends Inheritance {
  private double length;
  private double width;

  public Rectangle() {
    super();
    this.length = 0.0D;
    this.width = 0.0D;
  }
  public Rectangle(double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }
  public Rectangle(double length, double width, String color) {
    super(color);
    this.length = length;
    this.width = width;
  }
  public double calculateArea() {
    return length * width;
  }
  public double getLength() {
    return length;
  }
  public double getWidth() {
    return width;
  }
  public void setLength(double length) {
    this.length = length;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public String toString() {
    return super.toString() +
           "Length = " + length + "\n" +
           "Width = " + width + "\n";
  }
}

class Cube extends Rectangle {
  private double height;

  public Cube() {
    super();
    height = 0.0D;
  }
  public Cube(double height) {
    super();
    this.height = height;
  }
  public Cube(double height, double length, double width, String color) {
    super(length, width, color);
    this.height = height;
  }
  public double calculateArea() {
    double side1, side2, side3;

    side1 = super.calculateArea() * 2;
    side2 = height * getLength() * 2;
    side3 = height * getWidth() * 2;

    return side1 + side2 + side3;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public String toString() {
    return super.toString() +
           "Height = " + height + "\n";
  }
}

// Exercise:  Create classes representing Cylinder and Sphere.
//            Create instances of all the class types and call their methods.

class Driver {
  public static void main(String args[]) {
    Cube cube = new Cube(2, 3, 1, "blue");

    System.out.println();
    System.out.println("The area of our cube     = " + cube.calculateArea());

    Rectangle rectangle = new Cube(2, 4, 8, "red");
    System.out.println();
    System.out.println("The area of rectangle variable\n" +
                       "storing a reference to a cube  = " + rectangle.calculateArea());
    System.out.println();
  }
}


/** 
Ship ships[] = new Ship[5];
ships[0] = new AircraftCarrier();
*/