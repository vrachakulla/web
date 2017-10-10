package org.vr.spring.one.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.vr.spring.one.spring.annotation.service.MobileProcessor;

@Component
public class IPhone {

	@Autowired
	@Qualifier("aBionicProcessor")
	private MobileProcessor aBionicProcessor;

	public void configuration() {
		System.out.println("iPhoneX Features.");
		System.out.println("1) A-Bionic processor. " + aBionicProcessor.processor());
		System.out.println("2) Neural engine");
		System.out.println("3) Embedded M11 motion coprocessor");
		System.out.println("==============================================================");
	}

	public MobileProcessor getaBionicProcessor() {
		return aBionicProcessor;
	}

	public void setaBionicProcessor(MobileProcessor aBionicProcessor) {
		this.aBionicProcessor = aBionicProcessor;
	}

}
