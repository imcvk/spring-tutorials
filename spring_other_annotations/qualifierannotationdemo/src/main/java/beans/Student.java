package beans;

public class Student {
    String name,rollno;

    Student(){}
    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}
