package org.aarish.RESTJersy.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.aarish.RESTJersy.messenger.model.Message;
import org.aarish.RESTJersy.messenger.service.MessageService;

@Path("/messages")
public class MessegeResource {

	MessageService service = new MessageService();
	
	@GET
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam ("year") int year,
									 @QueryParam("start") int start,
									 @QueryParam("size") int size) {
		if(year>0)
			return service.getAllMessagesForYear(year);
		if(start>0 && size>0)
			return service.getAllMessagesPaginated(start, size);
		
		return service.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId) {
		return service.getMessage(messageId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return service.addMessage(message);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path( "/{messageId}" )
	public Message udpateMessage(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return service.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id) {
		service.removeMessage(id);
	}
	
//	This is a subresource
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}
	
}
