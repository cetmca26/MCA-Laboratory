class Area{
    static void area(double r){
        System.out.printf("The area of the circle is: %.2f", (3.14 * r * r));
    }
    static void area(int l, int b){
        System.out.println("The area of the rectangle is: "+(l * b));
    }
    static void area(int s){
        System.out.println("The area of the square is: "+(s * s));
    }
    public static void main(String[] args) {
        Area.area(5);
        Area.area(3.0);
        Area.area(3, 4);
        System.out.println("hello");
    }
}