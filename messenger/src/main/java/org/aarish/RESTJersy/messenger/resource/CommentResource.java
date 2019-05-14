package org.aarish.RESTJersy.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {

	@GET
	@Path("/{commentId}")
	public String getComment( @PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
		return "This is your comment: "+commentId+ " for message: "+messageId;
	}
	
}
