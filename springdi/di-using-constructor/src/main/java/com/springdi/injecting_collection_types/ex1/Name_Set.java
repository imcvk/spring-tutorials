package com.springdi.injecting_collection_types.ex1;

import java.util.Set;

public class Name_Set {
	Set<String> nameSet;

	public Name_Set(Set<String> nameSet) {
		this.nameSet = nameSet;
	}

	public void showNameSet() {
		System.out.println("Names stored in set via injection");
		for (String string : nameSet) {
			System.out.println(string);
		}
	}
}
