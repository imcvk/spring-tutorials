package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfig;
import dao.TeacherDAOImpl;
import entities.Teacher;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		TeacherDAOImpl teacherDAOImpl = (TeacherDAOImpl) context.getBean("getTeacher");
		int r = teacherDAOImpl.insert(new Teacher(234, "Ram"));
	}

}
