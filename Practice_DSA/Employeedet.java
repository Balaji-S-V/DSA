import java.util.Scanner;

class Member
{
    String name;
    int age;
    double phno;
    String address;
    double salary;
    String department;
    public Member(String name,int age,double phno,String address,double salary)
    {
    this.name=name;
    this.age=age;
    this.phno=phno;
    this.address=address;
    this.salary=salary;
    }
}
class Employee extends Member
{
    public Employee(String name,int age,double phno,String address,double salary)
    {
        super(name,age,phno,address,salary);
    }
}

class Manager extends Employee
{
    String department;
    public Manager(String name,int age,double phno,String address,double salary,String department)
    {
        super(name,age,phno,address,salary);
        this.department=department;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phno);
        System.out.println(address);
        System.out.println(salary);
        System.out.println(department);
    }
}
public class Employeedet
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        double phno=sc.nextDouble();
        String address=sc.next();
        double salary=sc.nextDouble();
        String department=sc.next();
        Manager e=new Manager(name, age, phno, address, salary, department);
        e.display();
    }
}
