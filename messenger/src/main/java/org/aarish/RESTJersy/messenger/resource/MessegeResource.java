package org.aarish.RESTJersy.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.aarish.RESTJersy.messenger.model.Message;
import org.aarish.RESTJersy.messenger.service.MessageService;

@Path("/messages")
public class MessegeResource {

	MessageService service = new MessageService();
	
	@GET
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return service.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId) {
		return service.getMessage(messageId);
	}
	

}
