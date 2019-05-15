package org.aarish.RESTJersy.messenger.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.aarish.RESTJersy.messenger.model.ErrorMessage;

@Provider
public class GenericExceptionMapper  implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500, "Check API again");
		return Response.status(Status.BAD_REQUEST)
				.type(MediaType.APPLICATION_JSON)
				.entity(errorMessage)
				.build();
	}

}
