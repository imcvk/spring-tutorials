package beans;

public class Student {

    private Book book;

    public Student(Book book) {
        this.book = book;
    }

    public void study() {
        System.out.println("Student is reading..");
        this.book.isIssued();
    }
}
