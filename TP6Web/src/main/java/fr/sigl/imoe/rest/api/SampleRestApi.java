package fr.sigl.imoe.rest.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Déclaration d'une application pour initier la configuration de l'API
 * REST.
 *
 * @author Chris
 */
@ApplicationPath("/imoerest")
@Provider
public class SampleRestApi extends Application implements ExceptionMapper<ContactException> {
	/**
	 * Méthode permettant d'intercepter les exceptions de type ContactException
	 * pour produire une réponse.
	 */
	@Override
	public Response toResponse(ContactException exception) {
		return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build(); 
	}

}
