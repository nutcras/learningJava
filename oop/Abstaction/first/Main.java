package oop.Abstaction.first;

public class Main {
    private static void showEmp(SeniorEmp Emp) {
        System.out.println(Emp.id);
        System.out.println(Emp.fname);
        System.out.println(Emp.lname);
        System.out.println(Emp.salary);
    }

    public static void main(String[] args) {
        // Employee Emp1 = new Employee();
        SeniorEmp Em1 = new SeniorEmp();
        System.out.println("ก่อนset");
        showEmp(Em1);
        Em1.hello();

        JuniorEmp Em2 = new JuniorEmp();
        Em2.hello();

        Em1.setSenior("53", "nazree", "awaekechi", 3000);
        System.out.println("หลังset");
        showEmp(Em1);
    }
}
