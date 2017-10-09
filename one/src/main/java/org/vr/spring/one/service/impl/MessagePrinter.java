package org.vr.spring.one.service.impl;

import org.springframework.stereotype.Component;
import org.vr.spring.one.service.MessageService;

@Component
public class MessagePrinter implements MessageService {

	private MessageHelper messageHelper;

	public String getMessage() {
		return "This is from MessageService";
	}

	public MessageHelper getMessageHelper() {
		return messageHelper;
	}

	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
}
