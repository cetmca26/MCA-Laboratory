class Employee {
    String emp_name, address;
    int emp_id;
    double salary;

    Employee(String emp_name, String address, int emp_id, double salary) {
        this.emp_name = emp_name;
        this.address = address;
        this.emp_id = emp_id;
        this.salary = salary;
    }
}

class Teacher extends Employee{
    String department, tr_name, subjects[];

    Teacher(String emp_name, String address, int emp_id, double salary, String department, String[] subjects) {
        super(emp_name, address, emp_id, salary);
        this.department = department;
        this.tr_name = emp_name;
        this.subjects = subjects;
    }

    void display(){
        System.out.println();
        System.out.printf("Emp_Name: %s%n", emp_name);
        System.out.printf("Tr_Name: %s%n", tr_name);
        System.out.printf("Emp_id: %d%n", emp_id);
        System.out.printf("Department: %s%n", department);
        System.out.printf("Adress: %s%n", address);
        System.out.printf("Salary: %.2f%n", salary);
        System.out.print("Subjects: ");
        for (String sub : subjects){
            System.out.print(sub + " ");
        }
        System.out.println("\n");
    }
}

public class Nteacher {
    public static void main(String[] args) {
        Teacher trs[] = new Teacher[3];
        trs[0] = new Teacher("Ramu", "Kattakada", 1234, 10000, "MCA", new String[] {"os", "network", "maths"});
        trs[1] = new Teacher("Babu", "Peroorkada", 1235, 20000, "CS", new String[] {"english", "hindi", "malayalam"});
        trs[2] = new Teacher("Sabu", "Thrikkanapuram", 1236, 15000, "Btech", new String[] {"digital", "java", "python"});

        trs[0].display();
        trs[1].display();
        trs[2].display();
    }
}