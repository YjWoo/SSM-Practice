package com.woo.test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jTest {
	public static void main(String[] args) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("pom.xml"));

		Element root = document.getRootElement();
		Element dependencies = root.element("dependencies");

		List<?> dependency = dependencies.elements("dependency");

		int count = 0;
		for (Iterator<?> it = dependency.iterator(); it.hasNext();) {
			Element element = (Element) it.next();
			Element groupID = element.element("groupId");
			System.out.println(groupID.getText());
			count++;
		}
		System.out.println("jar counts: " + count);

	}
}
