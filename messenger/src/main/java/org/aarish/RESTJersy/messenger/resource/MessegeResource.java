package org.aarish.RESTJersy.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.aarish.RESTJersy.messenger.model.Message;
import org.aarish.RESTJersy.messenger.service.MessageService;

@Path("/messages")
public class MessegeResource {

	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return service.getAllMessages();
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String postMessage() {
		return "Hello from Post message";
	}
}
