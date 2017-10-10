package org.vr.spring.one.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.vr.spring.one.spring.annotation.service.MobileProcessor;

@Component
public class Samasung {

	@Autowired
	@Qualifier("exynos")
	private MobileProcessor exynos;

	public void configuration() {
		System.out.println("Samsung Features.");
		System.out.println("1) Exynos processor. " + exynos.processor());
		System.out.println("==============================================================");
	}

	public MobileProcessor getExynos() {
		return exynos;
	}

	public void setExynos(MobileProcessor exynos) {
		this.exynos = exynos;
	}

}
