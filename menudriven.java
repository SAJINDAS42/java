import java.util.*;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class menudriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.area());
                    System.out.println("Perimeter of Circle: " + circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth of the rectangle: ");
                    double breadth = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle: " + rectangle.area());
                    System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
