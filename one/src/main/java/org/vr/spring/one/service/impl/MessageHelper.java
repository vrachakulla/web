package org.vr.spring.one.service.impl;

import org.springframework.stereotype.Component;

@Component
public class MessageHelper {

	private String string;

	public String getString() {
		return string;
	}

	public MessageHelper(String string) {
		super();
		this.string = string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "MessageHelper [string=" + string + "]";
	}
}
