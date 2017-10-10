package org.vr.spring.one.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.vr.spring.one.spring" })
// @ComponentScan(basePackages = { "org.vr.spring.one.spring.annotation, org.vr.spring.one.spring.annotation.service.impl" })
public class AppleConfig {

	/*@Bean
	public IPhone getIPhone() {
		return new IPhone();
	}
	
	@Bean
	public ABionicProcessor getABionicProcessor() {
		return new ABionicProcessor();
	}*/
}
