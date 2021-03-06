package spring_stereotype_annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("Chaitanya")
    private String name;
    @Value("2302")
    private String rollno;

    @Value("#{subs}")
    private List<String> subjects;

    
    Student() {
    }

    public Student(String name, String rollno, List<String> subjects) {
        this.name = name;
        this.rollno = rollno;
        this.subjects = subjects;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
   

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("Subjects: ");
        for (String sub : subjects)
            System.out.println(sub + ",");
 
    }
}

