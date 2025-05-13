import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n=sc.nextInt();
        sc.nextLine();
        employees[] arr=new employees[n];
        for(int i=0;i<n;i++){
            
            System.out.println("Enter name of employee");
            String name=sc.nextLine();
            System.out.println("Enter employee Number");
            int num=sc.nextInt(); 
            System.out.println("Enter salary of employee");
            int sal=sc.nextInt();
            employees em = new employees(num,name,sal);
            arr[i]=em;
            em=null;
            sc.nextLine();
        }
        while(true){
            System.out.println("Enter option \n 1:Search\t2:exit ");
            int op1=sc.nextInt();
            sc.nextLine(); 
            if(op1==1){
                
                System.out.println("Enter name of employee to search:");
                String sr1=sc.nextLine();
                for(int i=0;i<n;i++){
                    if(arr[i].name.equals(sr1)){
                        System.out.println("Found employee at "+i);
                        arr[i].display();
                        break;
                    }
                }
            }
            else if(op1==2){
                System.out.println("Your exited from the program");
                break;
            }
            else{
                System.out.println("please enter a valid option");
            }
        }
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


//8. array of objects of type class. create a class for employees having attributes enum, ename, salary. 
//Read n employee data and search for an employee using the employee number(use the concept of array of objects)