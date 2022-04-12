package com.springdi.injecting_collection_types.ex1;

import java.util.Map;

public class Name_Map {
	Map<String, String> nameMap;

	public Name_Map(Map<String, String> nameMap) {
		this.nameMap = nameMap;
	}

	public void showNameMap() {
		for (Map.Entry<String, String> entry : nameMap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
