package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import entities.Teacher;

public class TeacherDAOImpl implements TeacherDAO {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public TeacherDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public TeacherDAOImpl() {
		super();
	}

	public int insert(Teacher t) {
		String query = "insert into teacher(id,name) values(?,?)";
		int r = template.update(query, t.getId(), t.getName());
		System.out.println(r+" Record inserted...");
		return r;
	}

}
