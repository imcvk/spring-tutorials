package beans;

import java.util.List;

public class Subjects {
    private List<String> subjects;

    Subjects() {
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjects=" + subjects +
                '}';
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
