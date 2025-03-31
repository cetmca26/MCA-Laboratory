import java.util.*;
public class main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and n");
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        matrix ob1=new matrix(m, n);
        ob1.symmetric();
    }
}
class matrix {
    int m, n;
    int[][] array;

    matrix(int m, int n) {
        this.m = m;
        this.n = n;
        array = new int[m][n];
        addElement();
    }

    void addElement() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element" + i + j + " ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    void symmetric() {
        if (m != n) {
            System.out.println("Symmetry check is only valid for square matrices.");
            return;
        }
        
        boolean sym=true;
        for (int i = 0; i < m; i++) {
            if(sym){
                for (int j = 0; j < n; j++) {
                    if (array[i][j] != array[j][i]) {
                        System.out.println("it is not sysmmetric");
                        sym=false;
                        break;
                    }
                }
            }
            
        }
        if (sym) {
            System.out.println("MAtrix is symmetric");
        }
    }
}