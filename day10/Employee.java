package day10;

public class Employee {

    int eid;
    String ename;
    double esal;
    String job;

    void display() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esal);
        System.out.println("Employee Job: " + job);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.eid = 101;
        e1.ename = "John";
        e1.esal = 50000;
        e1.job = "Manager";

        e1.display();
        
    }
}