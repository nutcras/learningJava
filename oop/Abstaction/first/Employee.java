package oop.Abstaction.first;

//ตรงนี้คือ abstract 1 ใน concept OOP
public abstract class Employee {
    protected String id;
    protected String fname;
    protected String lname;
    protected double salary;

    Employee() {
        salary = 5000;
    }
}