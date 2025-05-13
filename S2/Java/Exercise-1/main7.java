import java.util.*;
public class main7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee");
        String name=sc.nextLine();
        System.out.println("Enter employee Number");
        int num=sc.nextInt(); 
        System.out.println("Enter da of employee");
        int da=sc.nextInt();
        System.out.println("Enter hr of employee");
        int hr=sc.nextInt();
        System.out.println("Enter basic salary of employee");
        int ba=sc.nextInt();
        int sal=da+hr+ba;
        employees em = new employees(num,name,sal);
    }
}

class employees{
    int sal,num;
    String name;
    employees(int num,String name,int sal){
        this.num=num;
        this.name=name;
        this.sal=sal;
        display();
    }
    void display(){
        System.out.println("Employee number: "+ num+"\nEmployee name: "+name+"\nTotal salary: "+sal);
    }
}

//7. create a java prog with a class for an employee having attributes enum, ename, salary. 
//find the total salary of that employee(da+hra+basic). 