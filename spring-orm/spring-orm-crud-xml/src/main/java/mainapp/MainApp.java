package mainapp;

import dao.StudentDAO;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAO studentDAO = context.getBean("studentdao", StudentDAO.class);
//        int r = studentDAO.insert(new Student(3334, "Chaitanya", "Pune"));
        while (true) {
            System.out.println(
                    "1: Insert" + " " +
                            "2:Display All" + " " +
                            "3:Display Single" + " " +
                            "4:Delete" + " " +
                            "5:Update" + " " +
                            "6:Exit"

            );
            try {
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1://insert
                        int r = studentDAO.insert(new Student(236, "sdfsdf", "sdfsdf"));
                        System.out.println("Inserted...");
                        break;
                    case 2://Display All
                        List<Student> students = studentDAO.getAllStudents();
                        for (Student s : students) {
                            System.out.println("ID:" + s.getId() + ",Name:" + s.getName() + ",City:" + s.getCity());
                        }
                        break;
                    case 3://Display single
                        System.out.println("Enter id to display student");
                        int id = sc.nextInt();
                        Student student = studentDAO.getStudent(id);
                        System.out.println("ID:" + student.getId() + ",Name:" + student.getName() + ",City:" + student.getCity());
                        break;
                    case 4://delete
                        System.out.println("Enter id to delete student");
                        int idTODelete = sc.nextInt();
                        studentDAO.delete(idTODelete);
                        break;
                    case 5:
                        System.out.println("Enter student details to Update");
                        System.out.println("Enter ID:");
                        int idstud = sc.nextInt();
                        System.out.println("Enter Name:");
                        String namestud = sc.next();
                        System.out.println("Enter City:");
                        String citystud = sc.next();
                        studentDAO.update(new Student(idstud, namestud, citystud));
                        break;
                    case 6:
                        break;
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
