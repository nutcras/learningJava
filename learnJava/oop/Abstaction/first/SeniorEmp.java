package oop.Abstaction.first;

public class SeniorEmp extends Employee{
    SeniorEmp(){
        id = "0";
        fname = "blank";
        lname = "blank";
    }

    public void setSenior(String id, String fname, String lname, double salary){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }
}