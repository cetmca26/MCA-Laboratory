
public class main10 {
    public static void main(String[] args) {
        shapes sh=new shapes();
        sh.area(3);
        sh.area(3, 05);
        sh.area(5, 6, true);
        
    }
}

class shapes{
    //triangle
    void area(int b,int h){
        System.out.println("Area of triangle : "+ .5*b*h);
    }
    //circle
    void area(int r){
        System.out.println("Area of circle : "+ 2*3.14*(r*r));
    }
    //rectangle
    void area(int l,int b, boolean t){
        System.out.println("Area of rectangle : "+ (l*b));
    }
}


//write a java prog to calculate area of different shapes using overloaded functions.