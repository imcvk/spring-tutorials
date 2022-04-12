package com.springdi.injecting_collection_types.ex1;

import java.util.List;

public class Name_List {
	List<String> nameList;

	public Name_List(List<String> nameList) {
		this.nameList = nameList;
	}

	public void showNameList() {
		System.out.println("Names stored in list via injection");
		for (String string : nameList) {
			System.out.println(string);
		}
	}
}
