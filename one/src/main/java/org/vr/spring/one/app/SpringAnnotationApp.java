package org.vr.spring.one.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vr.spring.one.spring.annotation.IPhone;
import org.vr.spring.one.spring.annotation.Samasung;
import org.vr.spring.one.spring.annotation.config.AppleConfig;

public class SpringAnnotationApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppleConfig.class);

		System.out.println("==============================================================");
		IPhone iPhone = applicationContext.getBean(IPhone.class);
		iPhone.configuration();

		Samasung samasung = applicationContext.getBean(Samasung.class);
		samasung.configuration();
	}
}
