package program.second;

public class Student {
    private String id;
    private String fname;
    private String lname;
    private double salary;
    private int daywork;
    private String major;

    public void setStudent(String id, String fname, String lname, double salary, int daywork) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.daywork = daywork;
    }

    public String getMajor() {
        return this.major;
    }

    private double calSalary() {
        return this.salary * this.daywork;
    }

    public void showAll() {
        System.out.println("id : " + this.id);
        System.out.println("name : " + this.fname + " " + this.lname);
    }

    public void showSal() {
        System.out.println("total salary : " + calSalary());
    }

    public Student() {
        major = "ComSci";
    }

}
