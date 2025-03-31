import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter option: ");
        int op;
        boolean boo=true;
            while (boo) {
            System.out.println("\nMenu:");
            System.out.println("1. Circle - Area and Perimeter");
            System.out.println("2. Rectangle - Area and Perimeter");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            op = sc.nextInt();

            switch (op) {
                case 1: // Circle
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    Shape circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.calculateArea());
                    System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
                    break;

                case 2: // Rectangle
                    System.out.print("Enter length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of the rectangle: ");
                    double breadth = sc.nextDouble();
                    Shape rectangle = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                    System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
                    break;

                case 5: // Exit
                    System.out.println("Exited from the program.");
                    boo = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}


//12. create an interface having prototype of functions-area and perimeter. create two classes circle and rectangle which implements the above 
//interface. create a menu driven program to find the area and perimeter of objects.  