package com.springdi.Setter_Injection_with_Non_String_Map_having_dependent_Object;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Answer, User> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Map.Entry<Answer, User>> set = answers.entrySet();
		Iterator<Map.Entry<Answer, User>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Answer, User> entry = itr.next();
			Answer ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans);
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}
}
