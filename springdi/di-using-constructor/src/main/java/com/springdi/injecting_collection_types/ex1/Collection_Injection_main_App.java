package com.springdi.injecting_collection_types.ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Collection_Injection_main_App {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContextCollectionInjection.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Name_List nameList = (Name_List) beanFactory.getBean("namelist");
		nameList.showNameList();

		Name_Set set = (Name_Set) beanFactory.getBean("nameSet");
		set.showNameSet();
	
		Name_Map nameMap=(Name_Map) beanFactory.getBean("nameMap");
		nameMap.showNameMap();
	}

}
