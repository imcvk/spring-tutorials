package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;


    Profile() {
    }

    public Profile(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "student=" + student.name + "," + student.rollno +
                '}';
    }
}
