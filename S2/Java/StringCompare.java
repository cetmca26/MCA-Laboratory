import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = sc.nextLine();
        System.out.println("Enter the second string: ");
        String b = sc.nextLine();
        if ( a.compareTo(b) == 0){
            System.out.println("Both the strings are equal!!");
        }
        else if(a.compareTo(b) < 0){
            System.out.println(a + " is lexicographically less than " + b);
        }
        else {
            System.out.println(a + " is lexicographically greater than " + b);
        }

        sc.close();
    }
}
