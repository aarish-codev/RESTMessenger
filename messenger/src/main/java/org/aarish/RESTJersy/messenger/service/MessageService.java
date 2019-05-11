package org.aarish.RESTJersy.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.aarish.RESTJersy.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1, "hi", "Chuck");
		Message m2 = new Message(2, "hello"	, "Foo");
		List<Message> messages = new ArrayList<>();
		messages.add(m1);
		messages.add(m2);
		
		return messages;
	}
	

}
