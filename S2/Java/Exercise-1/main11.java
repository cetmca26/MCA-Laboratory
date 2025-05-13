import java.util.*;
public class main11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of teachers:");
        int n=sc.nextInt();
        sc.nextLine();
        teacher[] arr=new teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name of employee");
            String name=sc.nextLine();
            System.out.println("Enter address of employee");
            String addr=sc.nextLine();
            System.out.println("Enter Department of employee");
            String Department=sc.nextLine();
            System.out.println("Enter employee Number");
            int num=sc.nextInt(); 
            System.out.println("Enter salary of employee");
            int sal=sc.nextInt();
            System.out.println("Enter subject code of employee");
            int subcode=sc.nextInt(); 
            teacher em = new teacher(num, name, sal, addr, Department, subcode);
            arr[i]=em;
            em=null;
            sc.nextLine();
        }
        for(int i=0;i<n;i++){
            arr[i].display();
        }
    }
}


class employees{
    int sal,num;
    String name,addr;
    employees(int num,String name,int sal,String addr){
        this.num=num;
        this.name=name;
        this.sal=sal;
        this.addr=addr;
        //display();
    }
    void display(){
        System.out.println("Employee number: "+ num+"\nEmployee name: "+name+"\nTotal salary: "+sal);
    }
}

class teacher extends employees{
    String dept;
    int subcode;
    teacher(int num,String name,int sal,String addr,String dept,int sub){
        super(num, name, sal, addr);
        this.dept=dept;
        this.subcode=sub;
    }
    void display(){
        System.out.println();
        System.out.println("Teachers Employee number: "+super.num);
        System.out.println("Teachers Employee Name: "+super.name);
        System.out.println("Teachers Employee Salary: "+super.sal);
        System.out.println("Teachers Employee Address: "+super.addr);
        System.out.println("Teachers Department: "+dept);
        System.out.println("Teachers Subject code: "+subcode);
    }
}

//11. create a java prog with a class for an employee having attributes enum, ename, salary,address.Create constructors to initialize the 
//attributes.Create another class teacher that inherits the properties of class employee and contain its own data members
//(department,tname,subject code) and constructors to initialise the data members. 
//include a display method to display all the data members. use array of objects to display the details of n teachers.
