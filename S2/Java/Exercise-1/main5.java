import java.util.*;
public class main5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ENter the element "+i+" :");
            arr[i]=sc.nextInt();
        }
        System.out.print("ENter the element to search: ");
        int sr=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(sr==arr[i]){
                System.out.println("Element found ! it is at "+i+" location");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}