import java.util.Scanner;

interface Area {
    void area();

    void perimeter();
}

class Circle implements Area {
    int r;

    Circle(int r) {
        this.r = r;
    }

    public void area() {
        System.out.printf("The area of circle is: %.2f%n", (3.14 * r * r));
    }

    public void perimeter() {
        System.out.printf("The perimeter of circle is: %.2f%n", (2 * 3.14 * r));
    }
}

class Rectangle implements Area {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("The area of rectangle is: " + (l * b));
    }

    public void perimeter() {
        System.out.println("The perimeter of the rectangle is: " + (2 * (l + b)));
    }
}

public class InterfaceAandP {
    public static void main(String[] args) {
        int choice;
        boolean is_running = true;
        Scanner sc = new Scanner(System.in);
        while (is_running) {
            System.out.println("1. Circle \n2. Rectangle \n3.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter radius of the circle: ");
                    Circle c = new Circle(sc.nextInt());
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.println("Enter length and breadth of the rectangle: ");
                    Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());
                    r.area();
                    r.perimeter();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    is_running = false;
                    break;
                default:
                    System.out.println("Wrong Choice!!!");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}