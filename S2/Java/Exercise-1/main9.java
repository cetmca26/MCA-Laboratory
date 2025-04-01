import java.util.*;

public class main9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        System.out.println("Enter the string and enter:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        //write a compareTo
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted string:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}




//write a java prog to sort strings using compateTo function.