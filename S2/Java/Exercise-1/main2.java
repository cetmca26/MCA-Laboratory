import java.util.*;
public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Select correct operation 1-Addition 2-multiplication 3-Transpose 4-exit");
            int op=sc.nextInt();
            if (op==4) {
                System.out.println("Yor existed from program");
                break;
            }
            System.out.print("Enter the size m:");
            int m=sc.nextInt();
            System.out.print("Enter the size m:");
            int n=sc.nextInt();
            matrix ob1=new matrix(m, n);
            ob1.display();
            matrix ob2=new matrix(m, n);
            ob2.display();
            operation op1=new operation(ob1, ob2);
            if(op==1){
                op1.addition();
            }
            else if(op==2){
                op1.multiplication();
            }
            else if(op==3){
                op1.Transpose();
            }
            else{
                System.out.println("Please enter a valid option");
            }
            ob1=null;
            ob2=null;
            op1=null;
        }
    }
}
class matrix{
    int m,n;
    int[][] array;
    matrix(int m,int n){
        this.m=m;
        this.n=n;
        array = new int[m][n];
        addElement();
    }
    void addElement(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter the element"+ i+j+" ");
                array[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
class operation{
    matrix ob1,ob2;
    operation(matrix ob1,matrix ob2){
        this.ob1=ob1;
        this.ob2=ob2;
    }
    
    void addition(){
        int[][] sum =new int [ob1.m][ob1.n];
    int[][] arr1=ob1.array;
    int[][] arr2=ob2.array;
        if(ob1.m==ob2.m && ob1.n==ob2.n){
            for(int i=0;i<ob1.m;i++){
                for(int j=0;j<ob1.n;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("Sum of two matrix");
            for(int i=0;i<ob1.m;i++){
                for(int j=0;j<ob1.n;j++){
                     System.out.print(sum[i][j]+" ");
                }
                System.out.println("");
            }
            
        }
        else{
            System.out.println("Matrix size is different");
        }
    }
    void  Transpose(){
        
        int[][] arr1=ob1.array;
        int[][] arr2=ob2.array;
        if(ob1.m==ob2.m && ob1.n==ob2.n){
            System.out.println("Transpose of two matrix");
            for(int i=0;i<ob1.m;i++){
                for(int j=0;j<ob1.n;j++){
                     System.out.print(arr1[j][i]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            for(int i=0;i<ob2.m;i++){
                for(int j=0;j<ob2.n;j++){
                     System.out.print(arr2[j][i]+" ");
                }
                System.out.println("");
            }
            
        }
        else{
            System.out.println("Matrix size is different");
        }
    }
    void multiplication(){
        if(ob1.n==ob2.m){
            int[][] mul =new int [ob1.m][ob2.n];
            int[][] arr1=ob1.array;
            int[][] arr2=ob2.array;
            for (int i = 0; i < ob1.m; i++) {
                for (int j = 0; j < ob2.n; j++) {
                    mul[i][j] = 0; // Initialize the sum to 0
                    for (int k = 0; k < ob1.n; k++) { // Loop through rows of arr2 (or columns of arr1)
                        mul[i][j] += arr1[i][k] * arr2[k][j]; // Accumulate the product
                    }
                }
            
            }
            System.out.println("Multiple of two matrix");
            for(int i=0;i<ob1.m;i++){
                for(int k=0;k<ob2.n;k++){
                     System.out.print(mul[i][k]+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Column of Matrix1 must be eqaul to rows of Matrix2");
        }
    } 
}