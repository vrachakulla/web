package org.vr.spring.one.spring.annotation.service.impl;

import org.springframework.stereotype.Component;
import org.vr.spring.one.spring.annotation.service.MobileProcessor;

@Component("aBionicProcessor")
public class ABionicProcessor implements MobileProcessor {

	public String processor() {
		return "A-11 Bionic chip with 64-bit architecture.";
	}
}
