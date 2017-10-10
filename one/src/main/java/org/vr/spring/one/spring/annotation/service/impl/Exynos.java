package org.vr.spring.one.spring.annotation.service.impl;

import org.springframework.stereotype.Component;
import org.vr.spring.one.spring.annotation.service.MobileProcessor;

@Component("exynos")
public class Exynos implements MobileProcessor {

	public String processor() {
		return "Exynos 9 Series";
	}

}
