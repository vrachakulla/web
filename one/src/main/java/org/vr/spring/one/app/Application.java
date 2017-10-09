package org.vr.spring.one.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vr.spring.one.service.impl.MessagePrinter;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
		System.out.println(printer.getMessage());

		/*MessageHelper messageHelper = (MessageHelper) context.getBean("messageHelper");
		System.out.println(messageHelper.getString());
		System.out.println(messageHelper);*/
	}
}
