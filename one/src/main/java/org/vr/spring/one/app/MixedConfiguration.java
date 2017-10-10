package org.vr.spring.one.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vr.spring.one.service.impl.MessagePrinter;

public class MixedConfiguration {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("MixedConfiguration.xml");
		MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
		System.out.println(printer.getMessage());
		System.out.println(printer.getMessageHelper());
	}

}
