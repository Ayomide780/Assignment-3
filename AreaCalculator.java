import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        // Prompt user to enter shape type
        System.out.println("Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int choice = Console.getInt("Enter your choice: ");

        // Calculate area based on user's choice
        switch (choice) {
            case 1:
                double radius = Console.getDouble("Enter radius of the circle: ");
                Circle circle = new Circle(radius);
                System.out.println(circle);
                break;
            case 2:
                double width = Console.getDouble("Enter width of the square: ");
                Square square = new Square(width);
                System.out.println(square);
                break;
            case 3:
                width = Console.getDouble("Enter width of the rectangle: ");
                double height = Console.getDouble("Enter height of the rectangle: ");
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println(rectangle);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

abstract class Shape {
    public abstract double getArea();

    @Override
    public String toString() {
        return "Area: " + getArea();
    }
}

class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Error! Please enter a valid integer.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Error! Please enter a valid number.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
